package com.marcdev.rental_app.modelDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SubscribeDTO {
    private Long amountOfSubscriber;
}
