package com.marcdev.rental_app.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users", schema = "rent")
public class Users {
    @OneToMany(mappedBy = "users")//article relationShip
    Set<Article> article;


    @OneToMany(mappedBy = "users") //subscribes
    Set<Subscribe> subscribe;

    @OneToMany(mappedBy = "users")
    Set<Comment> comment;

    @OneToMany(mappedBy = "users")
    Set<Ranking> ranking;

    @OneToMany(mappedBy = "users")
    Set<Message> messages;


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


    public Users(String username, String surname, String mail, String passWord, String sex, Long phoneNumber, String country, String role) {
    }
}
