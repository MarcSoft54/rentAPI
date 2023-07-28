package com.marcdev.rental_app.service.serviceImplement;

import com.marcdev.rental_app.model.Users;
import com.marcdev.rental_app.repository.RankingRepository;
import com.marcdev.rental_app.service.implServiceInterfaces.RankingImplService;
import org.springframework.stereotype.Service;

@Service
public class RankingService implements RankingImplService {

    RankingRepository rankingRepository;

    @Override
    public boolean createLike(Users users) {
        return true;
    }

    @Override
    public boolean createDislike(Users users) {
        return false;
    }

    @Override
    public void deleteLike(Long id) {
        rankingRepository.deleteById(id);
    }

    @Override
    public void deleteDislike(Long id) {
    rankingRepository.deleteById(id);
    }

    @Override
    public Long getLike() {
        return rankingRepository.count();
    }

    @Override
    public Long getDislike() {
        return rankingRepository.count();
    }
}
