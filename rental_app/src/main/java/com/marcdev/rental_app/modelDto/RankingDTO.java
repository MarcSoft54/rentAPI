package com.marcdev.rental_app.modelDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class RankingDTO {

    private Long like;
    private Long dislike;
}
