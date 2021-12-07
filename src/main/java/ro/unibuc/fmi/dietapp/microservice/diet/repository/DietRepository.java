package ro.unibuc.fmi.dietapp.microservice.diet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.fmi.dietapp.microservice.diet.model.Diet;

import java.util.List;

@Repository
public interface DietRepository extends JpaRepository<Diet, Long> {
    List<Diet> findByDietGoal(Long id);
    List<Diet> findByDietType(Long id);
}
