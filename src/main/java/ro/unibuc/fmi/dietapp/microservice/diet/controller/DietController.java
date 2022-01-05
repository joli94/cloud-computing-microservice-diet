package ro.unibuc.fmi.dietapp.microservice.diet.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.fmi.dietapp.microservice.diet.dto.DietDto;
import ro.unibuc.fmi.dietapp.microservice.diet.dto.DietGoalDto;
import ro.unibuc.fmi.dietapp.microservice.diet.mapper.DietMapper;
import ro.unibuc.fmi.dietapp.microservice.diet.model.Diet;
import ro.unibuc.fmi.dietapp.microservice.diet.model.DietGoal;
import ro.unibuc.fmi.dietapp.microservice.diet.service.DietService;

import java.util.List;

@RestController
@RequestMapping("/diets")
public class DietController {
    private final DietService service;
    private final DietMapper mapper;

    public DietController(DietMapper mapper, DietService service) {
        this.mapper = mapper;
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<DietDto>> findAll(){
        List<Diet> response = service.findAll();
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/goal")
    public ResponseEntity<List<DietDto>> findByGoal(@RequestParam Long id){
        List<Diet> response = service.findByGoal(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/type")
    public ResponseEntity<List<DietDto>> findByType(@RequestParam Long id){
        List<Diet> response = service.findByType(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DietDto> findById(@PathVariable Long id){
        Diet response = service.findById(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }
}
