package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.modelDto.ArticleDTO;
import com.marcdev.rental_app.model.Article;
import com.marcdev.rental_app.model.Comment;
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
    public String createArticle(ArticleDTO article) {
        var article1 = Article.builder()
                .typeArticle(article.getTypeArticle())
                .country(article.getCountry())
                .city(article.getCity())
                .description(article.getDescription())
                .livingRoom(article.getLivingRoom())
                .kitchen(article.getKitchen())
                .picturesArticle(article.getPictureArticle())
                .videoArticles(article.getVideoArticle())
                .parent(article.getParent())
                .mapUrl(article.getMapUrl())
                .room(article.getRooms())
                .priceArticle(article.getPriceArticle())
                .shower(article.getShowers())
                .parking(article.getParking())
                .lastModifyAt(Timestamp.valueOf(LocalDateTime.now()))
                .lastModifyBy(new User())
                .createBy(new User())
                .createAt(Timestamp.valueOf(LocalDateTime.now()))
                .comments(new Comment().getArticle().getComments())
                .ranking(new Ranking().getArticle().getRanking())
                .build();
        articlesRepository.save(article1);
        return "Successful Registration";
    }

    @Override
    public void deleteArticle(Article article) {
        articlesRepository.delete(article);
    }

    @Override
    public String updateArticle(Article article) {
        Optional<Article> article1 = articlesRepository.findById(article.getId());
        if(article1.isPresent()){
            article1.get().setPriceArticle(article.getPriceArticle());
            article1.get().setPicturesArticle(article.getPicturesArticle());
            article1.get().setDescription(article.getDescription());
            article1.get().setKitchen(article.getKitchen());
            article1.get().setLastModifyAt(article.getLastModifyAt());
            article1.get().setLivingRoom(article.getLivingRoom());
            article1.get().setParent(article.getParent());
            article1.get().setVideoArticles(article.getVideoArticles());
            article1.get().setTypeArticle(article.getTypeArticle());
            article1.get().setRoom(article.getRoom());
            article1.get().setShower(article.getShower());
            article1.get().setParking(article.getParking());
            article1.get().setLastModifyBy(article.getLastModifyBy());

            articlesRepository.save(article1.get());
            return " Update Successfully";
        }
        else {
            return "Article not Found";
        }
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
