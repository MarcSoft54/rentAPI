package com.marcdev.rental_app.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "ranking")
public class Ranking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ranking;

    @ManyToOne
    @JoinColumn(name = "id_users")
    User user;

    @ManyToOne
    @JoinColumn(name = "id_articles")
    Article article;

    @Column(name = "like")
    private Long like;

    @Column(name = "dislike")
    private Long dislike;
}
