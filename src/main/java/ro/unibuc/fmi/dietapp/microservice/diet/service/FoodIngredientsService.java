package ro.unibuc.fmi.dietapp.microservice.diet.service;

import org.springframework.stereotype.Service;
import ro.unibuc.fmi.dietapp.microservice.diet.model.FoodIngredients;
import ro.unibuc.fmi.dietapp.microservice.diet.repository.FoodIngredientsRepository;

import java.util.List;

@Service
public class FoodIngredientsService {
    private final FoodIngredientsRepository repository;

    public FoodIngredientsService(FoodIngredientsRepository repository) {
        this.repository = repository;
    }

    public List<FoodIngredients> findByFoodId(Long id){
        return repository.findByFoodId(id);
    }

}
