package com.marcdev.rental_app.modelDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArticleDTO {

    private String typeArticle;
    private String country;
    private double priceArticle;
    private String pictureArticle;
    private String videoArticle;
    private String description;
    private String city;
    private int rooms;
    private int showers;
    private int parking;
    private int kitchen;
    private int livingRoom;
    private String mapUrl;
    private Long parent;
    private Timestamp createAt;

    public ArticleDTO(
            String typeArticle,
            String country,
            double priceArticle,
            String pictureArticle,
            String videoArticle,
            String description,
            String city,
            int room,
            int showers,
            int parking,
            int kitchen,
            int livingRoom,
            String mapUrl) {

    }
}
