package com.marcdev.rental_app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class Users implements UserDetails {
    @OneToMany(mappedBy = "users")//articles relationShip
    Set<Articles> articles;

//    @OneToMany(mappedBy = "users") //subscribes
//    Set<Subscribe> subscribes;
//
    @OneToMany(mappedBy = "users")
    Set<Commenter> commenters;
//
//    @OneToMany(mappedBy = "users")
//    Set<Ranking> rankings;

    @Id
    @SequenceGenerator(
            name = "Users_sequence",
            sequenceName="Users_squence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Users_sequence")
    private Long id_users;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password",nullable = false)
    private String pasword;

    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "phone_number", nullable = false)
    private Long phone_number;

    @Column(name = "country")
    private String country;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.pasword;
    }

    @Override
    public String getUsername() {
        return this.username;
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
