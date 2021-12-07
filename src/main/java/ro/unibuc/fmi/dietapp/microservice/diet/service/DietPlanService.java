package ro.unibuc.fmi.dietapp.microservice.diet.service;

import org.springframework.stereotype.Service;
import ro.unibuc.fmi.dietapp.microservice.diet.model.DietPlan;
import ro.unibuc.fmi.dietapp.microservice.diet.repository.DietPlanRepository;

import java.util.List;

@Service
public class DietPlanService {
    private final DietPlanRepository repository;

    public DietPlanService(DietPlanRepository repository) {
        this.repository = repository;
    }

    public List<DietPlan> findByDiet(Long id){
        return repository.findByDietId(id);
    }
}
