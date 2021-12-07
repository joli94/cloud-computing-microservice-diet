package ro.unibuc.fmi.dietapp.microservice.diet.service;

import org.springframework.stereotype.Service;
import ro.unibuc.fmi.dietapp.microservice.diet.exception.EntityNotFoundException;
import ro.unibuc.fmi.dietapp.microservice.diet.model.Diet;
import ro.unibuc.fmi.dietapp.microservice.diet.repository.DietRepository;

import java.util.List;

@Service
public class DietService {
    private final DietRepository repository;

    public DietService(DietRepository dietRepository) {
        this.repository = dietRepository;
    }

    public List<Diet> findAll(){
        return repository.findAll();
    }

    public List<Diet> findByGoal(Long id) { return repository.findByDietGoalId(id); }

    public List<Diet> findByType(Long id) { return repository.findByDietTypeId(id); }

    public Diet findById(Long id) { return repository.findById(id).orElseThrow(
            ()-> new EntityNotFoundException("The diet with this id doesn't exist in the database!")
    );
    }
}