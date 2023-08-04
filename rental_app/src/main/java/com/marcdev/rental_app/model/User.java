package com.marcdev.rental_app.model;

import com.marcdev.rental_app.config.CustomUserDetails;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Set;


@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user", schema = "rent")
public class User {
    @OneToMany(mappedBy = "user")//article relationShip
    Set<Article> article;

    @OneToMany(mappedBy = "user") //subscribes
    Set<Subscribe> subscribe;

    @OneToMany(mappedBy = "user")
    Set<Comment> comment;

    @OneToMany(mappedBy = "user")
    Set<Ranking> ranking;

    @OneToMany(mappedBy = "user")
    Set<Message> messages;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String username;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String surname;
    @Column(nullable = false, columnDefinition = "TEXT", unique = true)
    private String email;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String passWord;
    @Column
    private String sex;
    @Column( nullable = false, unique = true)
    private int phoneNumber;
    @Column
    private String country, columnDefinition = "TEXT";
    @Column()
    private Role role;


    public User(String username, String surname, String mail, String passWord, String sex, int phoneNumber, String country, String role) {
    }
}
