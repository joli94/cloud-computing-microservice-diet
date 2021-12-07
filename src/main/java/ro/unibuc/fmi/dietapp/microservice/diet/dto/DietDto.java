package ro.unibuc.fmi.dietapp.microservice.diet.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DietDto {
    private Long id;

    private String name;

    private long price;

    private long maximumCalories;

    private Long dietGoal;

    private Long dietType;
}
