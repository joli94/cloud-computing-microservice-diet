package ro.unibuc.fmi.dietapp.microservice.diet.service;

import org.springframework.stereotype.Service;
import ro.unibuc.fmi.dietapp.microservice.diet.exception.EntityNotFoundException;
import ro.unibuc.fmi.dietapp.microservice.diet.model.FoodIngredients;
import ro.unibuc.fmi.dietapp.microservice.diet.model.Ingredient;
import ro.unibuc.fmi.dietapp.microservice.diet.repository.IngredientRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class IngredientService {
    private final IngredientRepository repository;
    private final FoodIngredientsService service;

    public IngredientService(IngredientRepository repository, FoodIngredientsService service) {
        this.repository = repository;
        this.service = service;
    }

    public List<Ingredient> findAll(){ return repository.findAll(); }

    public List<Ingredient> findByFoodId(Long id){
        List<Ingredient> ingredientList = new ArrayList<>();
        List<FoodIngredients> result =  service.findByFoodId(id);

        result.forEach((foodIngredients) -> ingredientList.add(findById(foodIngredients.getIngredient().getId())));

        return ingredientList;
    }

    public Ingredient findById(Long id){
        return repository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("The ingredient  with this id doesn't exist in the database!")
        );
    }
}
