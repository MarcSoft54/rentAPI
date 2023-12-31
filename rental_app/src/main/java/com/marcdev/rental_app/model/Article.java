package com.marcdev.rental_app.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Set;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "article", schema = "rent")
public class Article {

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user;

    @OneToMany(mappedBy = "article")
    Set<Comment> comments;

    @OneToMany(mappedBy = "article")
    Set<Ranking> ranking;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type_article", nullable = false, columnDefinition = "TEXT")
    private String typeArticle;
    @Column(name = "price_article", nullable = false)
    private double priceArticle;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String country;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String city;
    @Column(name = "map_url",nullable = false, columnDefinition = "TEXT")
    private String mapUrl;
    @Column(name = "picture",nullable = false, columnDefinition = "TEXT")
    private String picturesArticle;
    @Column(name = "video", nullable = false, columnDefinition = "TEXT")
    private String videoArticles;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;
    @Column
    private Long parent;
    @Column(nullable = false)
    private int room;
    @Column
    private int shower;
    @Column
    private int parking;
    @Column
    private int kitchen;
    @Column
    private int livingRoom;

    @Column(unique = true)
    private Timestamp createAt;
    @Column(unique = true)
    private User createBy;
    @Column(unique = true)
    private User lastModifyBy;
    @Column(unique = true)
    private Timestamp lastModifyAt;

    public Article(String typeArticle, String country, double priceArticle, Long parent, String pictureArticle, String videoArticle, String description, String city, int rooms, int parking, int livingRoom, String mapUrl) {
    }
}

