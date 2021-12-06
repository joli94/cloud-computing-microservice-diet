package ro.unibuc.fmi.dietapp.microservice.diet.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IngredientDto {
    private Long id;
    private String name;
    private Long calories;
}
