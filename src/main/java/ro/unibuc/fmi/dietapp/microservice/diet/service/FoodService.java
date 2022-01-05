package ro.unibuc.fmi.dietapp.microservice.diet.service;

import org.springframework.stereotype.Service;
import ro.unibuc.fmi.dietapp.microservice.diet.exception.EntityNotFoundException;
import ro.unibuc.fmi.dietapp.microservice.diet.model.DietPlan;
import ro.unibuc.fmi.dietapp.microservice.diet.model.Food;
import ro.unibuc.fmi.dietapp.microservice.diet.repository.FoodRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {
    private final FoodRepository repository;
    private final DietPlanService service;

    public FoodService(FoodRepository repository, DietPlanService service) {
        this.repository = repository;
        this.service = service;
    }

    public List<Food> findAll(){
        return repository.findAll();
    }

    public List<Food> findByDiet(Long id){
        List<Food> foodList = new ArrayList<>();
        List<DietPlan> result =  service.findByDiet(id);

        result.forEach((food) -> foodList.add(findById(food.getFood().getId())));

        return foodList;
    }

    public Food findById(Long id){
        return repository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException(String.format("The food with the id=%s doesn't exist in the database!", id.toString()))
        );
    }
}
