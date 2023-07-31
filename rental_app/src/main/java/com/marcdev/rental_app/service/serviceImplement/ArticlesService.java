package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.auth.AuthentificationResponse;
import com.marcdev.rental_app.auth.CreateArticle;
import com.marcdev.rental_app.config.JwtService;
import com.marcdev.rental_app.model.Article;
import com.marcdev.rental_app.model.Commenter;
import com.marcdev.rental_app.model.Ranking;
import com.marcdev.rental_app.model.User;
import com.marcdev.rental_app.repository.ArticlesRepository;
import com.marcdev.rental_app.service.implServiceInterfaces.ArticlesImplService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ArticlesService implements ArticlesImplService {

    private ArticlesRepository articlesRepository;


    @Override
    public String createArticle(CreateArticle article) {
        var article1 = Article.builder()
                .type_articles(article.getTypeArticle())
                .country(article.getCountry())
                .city(article.getCity())
                .description(article.getDescription())
                .livingRoom(article.getLivingRoom())
                .kitchen(article.getKitchen())
                .pictures_articles(article.getPictureArticle())
                .video_articles(article.getVideoArticle())
                .parent(article.getParent())
                .map_url(article.getMap_url())
                .rooms(article.getRooms())
                .price_articles(article.getPriceArticle())
                .showers(article.getShowers())
                .parking(article.getParking())
                .lastModifyAt(Timestamp.valueOf(LocalDateTime.now()))
                .lastModifyBy(new User())
                .createBy(new User())
                .createAt(Timestamp.valueOf(LocalDateTime.now()))
                .commenters(new Commenter().getArticle().getCommenters())
                .ranking(new Ranking().getArticle().getRanking())
                .build();
        articlesRepository.save(article1);
        return "succefully registration";
    }

    @Override
    public void deleteArticle(Article article) {
            articlesRepository.delete(article);
    }

    @Override
    public AuthentificationResponse updateArticle(Article article) {
        return null;
    }


    @Override
    public Optional<Article> searchArticle(Long id) {
        return articlesRepository.findById(id);
    }

    @Override
    public Iterable<Article> getArticles() {
        return articlesRepository.findAll();
    }

}
