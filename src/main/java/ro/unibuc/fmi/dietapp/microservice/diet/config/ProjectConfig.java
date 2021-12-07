package ro.unibuc.fmi.dietapp.microservice.diet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.unibuc.fmi.dietapp.microservice.diet.mapper.FoodMapper;
import ro.unibuc.fmi.dietapp.microservice.diet.mapper.FoodMapperImpl;
import ro.unibuc.fmi.dietapp.microservice.diet.mapper.IngredientMapper;
import ro.unibuc.fmi.dietapp.microservice.diet.mapper.IngredientMapperImpl;

@Configuration
public class ProjectConfig {
    @Bean
    public FoodMapper foodMapper(){ return new FoodMapperImpl(); }

    @Bean
    public IngredientMapper ingredientMapper(){ return new IngredientMapperImpl(); }
}
