package ro.unibuc.fmi.dietapp.microservice.diet.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Diet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DIET_ID")
    private Long id;

    @Column(name = "DIET_NAME")
    private String name;

    @Column(name = "DIET_PRICE")
    private long price;

    @Column(name = "DIET_MAXIMUM_CALORIES")
    private long maximumCalories;

    private DietType dietType;

    private DietGoal dietGoal;

    @OneToMany(mappedBy = "diet", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<DietPlan> dietPlanList;
}
