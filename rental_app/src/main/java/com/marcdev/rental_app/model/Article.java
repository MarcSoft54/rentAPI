package com.marcdev.rental_app.model;
import jakarta.persistence.*;
import lombok.Data;
import java.sql.Timestamp;
import java.util.Set;

@Data
@Entity
@Table(name = "article")
public class Article {

    @ManyToOne
    @JoinColumn(name = "id_users", nullable = false)
    User user;

    @OneToMany(mappedBy = "article")
    Set<Commenter> commenters;

    @OneToMany(mappedBy = "article")
    Set<Ranking> ranking;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_articles;
    @Column(name = "type_articles", nullable = false)
    private String type_articles;
    @Column(name = "price_articles", nullable = false)
    private double price_articles;
    @Column(name = "country", nullable = false)
    private String country;
    @Column(name = "city",nullable = false)
    private String city;
    @Column(name = "map_url",nullable = false)
    private String map_url;
    @Column(name = "pictures",nullable = false)
    private String pictures_articles;
    @Column(name = "video", nullable = false)
    private String video_articles;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "parent")
    private Long parent;
    @Column(name = "rooms", nullable = false)
    private int rooms;
    @Column(name = "showers")
    private int showers;
    @Column(name = "parking")
    private int parking;
    @Column(name = "kitchen")
    private int kitchen;
    @Column(name = "livingRoom")
    private int livingRoom;

    @Column(name = "createAt")
    private Timestamp createAt;
    @Column(name = "createBy")
    private User createBy;
    @Column(name = "lastModifyBy")
    private User lastModifyBy;
    @Column(name = "lastModifyAt")
    private Timestamp lastModifyAt;
}
