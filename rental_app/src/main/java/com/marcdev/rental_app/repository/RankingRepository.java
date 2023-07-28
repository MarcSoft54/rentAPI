package com.marcdev.rental_app.repository;

import com.marcdev.rental_app.model.Ranking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankingRepository extends CrudRepository<Ranking, Long> {
}
