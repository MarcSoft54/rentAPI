package com.marcdev.rental_app.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Set;


@Entity
@EntityScan
@Data
@Table(name="users")
public class Users {
    @OneToMany(mappedBy = "users")//articles relationShip
    Set<Articles> articles;

    @OneToMany(mappedBy = "users") //subscribes
    Set<Subscribe> subscribes;

    @ManyToOne // comment
    @JoinColumn(name = "id_users")
    Commenter commenter;

    @OneToMany(mappedBy = "users")
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

    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "phone_number", nullable = false)
    private Long phone_number;

    @Column(name = "country")
    private String country;



}
