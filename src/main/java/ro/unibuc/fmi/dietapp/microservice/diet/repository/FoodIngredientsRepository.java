package ro.unibuc.fmi.dietapp.microservice.diet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.fmi.dietapp.microservice.diet.model.FoodIngredients;

import java.util.List;

@Repository
public interface FoodIngredientsRepository extends JpaRepository<FoodIngredients, Long> {
    List<FoodIngredients> findByFoodId(Long id);
}
