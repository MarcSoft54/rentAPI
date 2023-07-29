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


//    @ManyToOne
//    @JoinColumn(name = "id_users")
//    Users users;

//    @ManyToOne
//    @JoinColumn(name = "id_articles")
//    Articles articles;


    @Column(name = "like")
    private Long like;

    @Column(name = "dislike")
    private Long dislike;
}
