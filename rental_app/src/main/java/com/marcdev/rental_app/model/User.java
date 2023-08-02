package com.marcdev.rental_app.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="user")
public class User implements UserDetails {
    @OneToMany(mappedBy = "user")//article relationShip
    Set<Article> article;

    @OneToMany(mappedBy = "user") //subscribes
    Set<Subscribe> subscribe;

    @OneToMany(mappedBy = "user")
    Set<Comment> comment;

    @OneToMany(mappedBy = "user")
    Set<Ranking> ranking;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String passWord;
    @Column
    private String sex;
    @Column( nullable = false)
    private Long phoneNumber;
    @Column
    private String country;
    @Column()
    private Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
