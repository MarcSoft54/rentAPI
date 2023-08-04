package com.marcdev.rental_app.controller;

import com.marcdev.rental_app.mapperModel.ArticleMapper;
import com.marcdev.rental_app.mapperModel.RankingMapper;
import com.marcdev.rental_app.mapperModel.UserMapper;
import com.marcdev.rental_app.model.Ranking;
import com.marcdev.rental_app.modelDto.ArticleDTO;
import com.marcdev.rental_app.modelDto.UserDTO;
import com.marcdev.rental_app.service.serviceImplement.RankingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RankingController {

    RankingService rankingService;
    RankingMapper rankingMapper;
    UserMapper userMapper;
    ArticleMapper articleMapper;

    @PostMapping("/like")
    public void createLikes(Ranking ranking, UserDTO user, ArticleDTO article){
        var rank = rankingMapper.toDto(ranking);
        var user1 = userMapper.toUser(user);
        var article1 = articleMapper.toArticle(article);
        rankingService.createLike(rank,user1,article1);
    }

    @PostMapping("/dislike")
    public void createDislike(Ranking ranking, UserDTO user, ArticleDTO article){
        var rank = rankingMapper.toDto(ranking);
        var user1 = userMapper.toUser(user);
        var article1 = articleMapper.toArticle(article);
        rankingService.createDislike(rank, user1, article1);
    }

    @PostMapping("/delLike")
    public void deleteLike(UserDTO userDTO){
        var user = userMapper.toUser(userDTO);
        rankingService.deleteLike(user);
    }

    @PostMapping("delDislike")
    public void deleteDislike(UserDTO userDTO){
        var user = userMapper.toUser(userDTO);
        rankingService.deleteLike(user);
    }

    @GetMapping("/getDislike")
    public Long getDislike(){
        return rankingService.getDislike();
    }

    @GetMapping("/getLike")
    public Long getLike(){
        return rankingService.getLike();
    }
}
