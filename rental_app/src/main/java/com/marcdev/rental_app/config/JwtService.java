package com.marcdev.rental_app.config;

import com.marcdev.rental_app.auth.CreateAccount;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Component
public class JwtService {

    private static final String SECRET_KEY = "01234567890123456789012345678901234567890123456789";

    public String extractName(String token){
        return extractClaim(token, Claims::getSubject);
    }


    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver){
        final Claims claims = extractAllClaim(token);
        return claimsResolver.apply(claims);
    }

    public String genereToken(UserDetails userDetails){
        return genereToken((new HashMap<>()), userDetails);
    }

    public String genereToken(
            Map<String, Object> extraClaims, UserDetails userDetails
    ){
        return Jwts.builder().setClaims(extraClaims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 10000))
                .signWith(SignatureAlgorithm.HS256, getSignInKey())
                .compact();
    }

    public boolean isTokenValid(String token, UserDetails userDetails){
        final String userName = extractName(token);
        return (userName.equals(userDetails.getUsername()))&& !isTokenExpired(token);
    }

    private boolean isTokenExpired(String token){
        return extraExpiration(token).before(new Date());
    }

    private Date extraExpiration(String token){
        return extractClaim(token, Claims::getExpiration);
    }

    private Claims extractAllClaim(String token){
        return Jwts.parserBuilder()
                .setSigningKey(getSignInKey()).build()
                .parseClaimsJws(token)
                .getBody();
    }

   public Key getSignInKey(){
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
   }
}
