package ro.unibuc.fmi.dietapp.microservice.diet.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.fmi.dietapp.microservice.diet.dto.IngredientDto;
import ro.unibuc.fmi.dietapp.microservice.diet.mapper.IngredientMapper;
import ro.unibuc.fmi.dietapp.microservice.diet.model.Ingredient;
import ro.unibuc.fmi.dietapp.microservice.diet.service.IngredientService;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {
    private final IngredientService service;
    private final IngredientMapper mapper;

    public IngredientController(IngredientService service, IngredientMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<IngredientDto>> findAll(){
        List<Ingredient> response = service.findAll();
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/food")
    public ResponseEntity<List<IngredientDto>> findByFoodId(@RequestParam Long id){
        List<Ingredient> response = service.findByFoodId(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<IngredientDto> findById(@PathVariable Long id){
        Ingredient response = service.findById(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }
}
