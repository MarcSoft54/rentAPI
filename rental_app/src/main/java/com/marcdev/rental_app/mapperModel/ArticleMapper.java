package com.marcdev.rental_app.mapperModel;

import com.marcdev.rental_app.model.Article;
import com.marcdev.rental_app.modelDto.ArticleDTO;
import org.springframework.stereotype.Component;

@Component
public class ArticleMapper {

    public ArticleDTO toDto(Article article){
        String typeArticle = article.getTypeArticle();
        String country = article.getCountry();
        double priceArticle = article.getPriceArticle();
        String pictureArticle = article.getPicturesArticle();
        String videoArticle = article.getVideoArticles();
        String description = article.getDescription();
        String city = article.getCity();
        int room = article.getRoom();
        int showers = article.getShower();
        int parking = article.getParking();
        int kitchen = article.getKitchen();
        int livingRoom = article.getLivingRoom();
        String mapUrl = article.getMapUrl();

        return new ArticleDTO(
                typeArticle,
                country,
                priceArticle,
                pictureArticle,
                videoArticle,
                description,
                city,
                room,
                showers,
                parking,
                kitchen,
                livingRoom,
                mapUrl
        );
    }

    public Article toArticle(ArticleDTO articleDTO){
        return new Article(
                articleDTO.getTypeArticle(),
                articleDTO.getCountry(),
                articleDTO.getPriceArticle(),
                articleDTO.getParent(),
                articleDTO.getPictureArticle(),
                articleDTO.getVideoArticle(),
                articleDTO.getDescription(),
                articleDTO.getCity(),
                articleDTO.getRooms(),
                articleDTO.getParking(),
                articleDTO.getLivingRoom(),
                articleDTO.getMapUrl()
        );
    }
}
