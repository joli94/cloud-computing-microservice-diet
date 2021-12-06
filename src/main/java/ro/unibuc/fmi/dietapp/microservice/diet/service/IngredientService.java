package ro.unibuc.fmi.dietapp.microservice.diet.service;

import org.springframework.stereotype.Service;
import ro.unibuc.fmi.dietapp.microservice.diet.exception.EntityNotFoundException;
import ro.unibuc.fmi.dietapp.microservice.diet.model.Ingredient;
import ro.unibuc.fmi.dietapp.microservice.diet.repository.IngredientRepository;

import java.util.List;

@Service
public class IngredientService {
    private final IngredientRepository repository;

    public IngredientService(IngredientRepository repository) {
        this.repository = repository;
    }

    public List<Ingredient> findAll(){ return repository.findAll(); }

    //findByFood(Long id)

    public Ingredient findById(Long id){
        return repository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("The ingredient  with this id doesn't exist in the database!")
        );
    }
}
