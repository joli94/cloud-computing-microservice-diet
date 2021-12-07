package ro.unibuc.fmi.dietapp.microservice.diet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.unibuc.fmi.dietapp.microservice.diet.mapper.*;

@Configuration
public class ProjectConfig {
    @Bean
    public DietMapper dietMapper(){ return new DietMapperImpl(); }

    @Bean
    public FoodMapper foodMapper(){ return new FoodMapperImpl(); }

    @Bean
    public IngredientMapper ingredientMapper(){ return new IngredientMapperImpl(); }
}
