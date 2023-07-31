package com.marcdev.rental_app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="users")
public class User implements UserDetails {
    @OneToMany(mappedBy = "user")//article relationShip
    Set<Article> articles;

    @OneToMany(mappedBy = "user") //subscribes
    Set<Subscribe> subscribes;

    @OneToMany(mappedBy = "user")
    Set<Commenter> commenters;

    @OneToMany(mappedBy = "user")
    Set<Ranking> rankings;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_users;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "sex")
    private String sex;

    @Column(name = "phone_number")
    private Long phone_number;

    @Column(name = "country")
    private String country;

    @Column(name = "role")
    private Role role;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
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
        return false;
    }
}
