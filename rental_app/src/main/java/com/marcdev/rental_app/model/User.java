package com.marcdev.rental_app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="user")
public class User extends CustomUserDetail{
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
    private String password;

    @Column
    private String sex;

    @Column( nullable = false)
    private Long phone_number;

    @Column
    private String country;

    @Column(nullable = false)
    private Role role;

}
