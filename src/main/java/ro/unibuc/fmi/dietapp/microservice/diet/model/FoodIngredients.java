package ro.unibuc.fmi.dietapp.microservice.diet.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "food_ingredients")

@Getter
public class FoodIngredients {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "food_ingredients_id")
    private Long id;

    @ManyToOne
    private Food food;

    @ManyToOne
    private Ingredient ingredient;
}
