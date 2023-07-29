package com.marcdev.rental_app.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Set;

@Data
@Entity
@Table(name = "comments")
public class Commenter {

    @ManyToOne
            @JoinColumn( name= "user_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "articles_id")
    private Articles articles;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id_comment;

    @Column(name = "comment")
    private String comment;

    @Column(name = "madeAt")
    private Timestamp madeAt;
}
