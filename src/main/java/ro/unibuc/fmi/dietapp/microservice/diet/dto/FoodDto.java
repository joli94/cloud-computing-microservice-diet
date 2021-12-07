package ro.unibuc.fmi.dietapp.microservice.diet.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FoodDto {
    private Long id;

    private String name;

    private Long calories;

    private String category;
}
