package ro.unibuc.fmi.dietapp.microservice.diet.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.fmi.dietapp.microservice.diet.dto.FoodDto;
import ro.unibuc.fmi.dietapp.microservice.diet.mapper.FoodMapper;
import ro.unibuc.fmi.dietapp.microservice.diet.model.Food;
import ro.unibuc.fmi.dietapp.microservice.diet.service.FoodService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/foods")
public class FoodController {
    private final FoodService service;
    private final FoodMapper mapper;

    public FoodController(FoodService service, FoodMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<FoodDto>> findAll(){
        List<Food> response = service.findAll();
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/diet")
    public ResponseEntity<List<FoodDto>> findByDiet(@RequestParam Long id){
        List<Food> response = service.findByDiet(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FoodDto> findById(@PathVariable Long id){
        Food response = service.findById(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }
}
