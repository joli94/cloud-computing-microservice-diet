package ro.unibuc.fmi.dietapp.microservice.diet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.fmi.dietapp.microservice.diet.model.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
}
