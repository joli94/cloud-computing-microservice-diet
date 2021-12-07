package ro.unibuc.fmi.dietapp.microservice.diet.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.fmi.dietapp.microservice.diet.dto.FoodDto;
import ro.unibuc.fmi.dietapp.microservice.diet.model.Food;

@Mapper
public interface FoodMapper extends EntityMapper<FoodDto, Food> {
}
