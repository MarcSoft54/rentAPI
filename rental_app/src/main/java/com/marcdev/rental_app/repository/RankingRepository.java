package com.marcdev.rental_app.repository;

import com.marcdev.rental_app.model.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.spi.LocaleNameProvider;

@Repository
public interface RankingRepository extends JpaRepository<Ranking, Long> {

    Optional<Ranking> getLike(Long l);

    Optional<Ranking> getDislike(Long l);

    Long getCountLike();
}
