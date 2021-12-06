package ro.unibuc.fmi.dietapp.microservice.diet.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.fmi.dietapp.microservice.diet.dto.IngredientDto;
import ro.unibuc.fmi.dietapp.microservice.diet.model.Ingredient;

@Mapper
public interface IngredientMapper extends EntityMapper<IngredientDto, Ingredient>{
}
