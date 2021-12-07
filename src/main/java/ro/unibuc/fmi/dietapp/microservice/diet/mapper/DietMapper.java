package ro.unibuc.fmi.dietapp.microservice.diet.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.fmi.dietapp.microservice.diet.dto.DietDto;
import ro.unibuc.fmi.dietapp.microservice.diet.model.Diet;

@Mapper
public interface DietMapper extends EntityMapper<DietDto, Diet>{
}
