package ro.unibuc.fmi.dietapp.microservice.diet.model;

import javax.persistence.*;

@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "food_id")
    private Long id;

    private String name;

    private Long calories;
}
