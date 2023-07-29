package com.marcdev.rental_app.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "comments")
public class Commenter {

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_articles", nullable = false)
    private Article article;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id_comment;

    @Column(name = "comment")
    private String comment;

    @Column(name = "madeAt")
    private Timestamp madeAt;
}
