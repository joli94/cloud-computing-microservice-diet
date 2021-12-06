package ro.unibuc.fmi.dietapp.microservice.diet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.unibuc.fmi.dietapp.microservice.diet.mapper.IngredientMapper;
import ro.unibuc.fmi.dietapp.microservice.diet.mapper.IngredientMapperImpl;

@Configuration
public class ProjectConfig {
    @Bean
    public IngredientMapper ingredientMapper(){ return new IngredientMapperImpl();
    }
}
