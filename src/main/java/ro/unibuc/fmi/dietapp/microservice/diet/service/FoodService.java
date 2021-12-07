package ro.unibuc.fmi.dietapp.microservice.diet.service;

import org.springframework.stereotype.Service;
import ro.unibuc.fmi.dietapp.microservice.diet.exception.EntityNotFoundException;
import ro.unibuc.fmi.dietapp.microservice.diet.model.Food;
import ro.unibuc.fmi.dietapp.microservice.diet.repository.FoodRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {
    private final FoodRepository repository;

    public FoodService(FoodRepository repository) {
        this.repository = repository;
    }

    public List<Food> findAll(){
        return repository.findAll();
    }

    public Food findById(Long id){
        return repository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("The food with this id doesn't exist in the database!")
        );
    }
}
