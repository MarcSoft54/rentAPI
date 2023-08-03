package com.marcdev.rental_app.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Set;


@EqualsAndHashCode(callSuper = true)
@Entity
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="users", schema = "rent")
public class User extends CustomUserDetails{

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

    public User(String username, String surname, String mail, String passWord, String sex, Long phoneNumber, String country, String role) {
    }
}
