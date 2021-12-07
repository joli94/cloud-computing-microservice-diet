package ro.unibuc.fmi.dietapp.microservice.diet.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "diet_plan")

@Getter
public class DietPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "diet_plan_id")
    private Long id;

    @ManyToOne
    private Diet diet;

    @ManyToOne
    private Food food;

}
