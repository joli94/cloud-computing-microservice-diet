package ro.unibuc.fmi.dietapp.microservice.diet.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "food_id")
    private Long id;

    private String name;

    private Long calories;

    @OneToMany(mappedBy = "food", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<FoodIngredients> foodIngredientsList;

    private FoodCategory category;
}
