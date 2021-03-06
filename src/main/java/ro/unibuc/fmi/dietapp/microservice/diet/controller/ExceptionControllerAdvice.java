package ro.unibuc.fmi.dietapp.microservice.diet.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ro.unibuc.fmi.dietapp.microservice.diet.dto.ErrorDto;
import ro.unibuc.fmi.dietapp.microservice.diet.exception.BadRequestException;
import ro.unibuc.fmi.dietapp.microservice.diet.exception.EntityNotFoundException;

@ControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler
    protected ResponseEntity<ErrorDto> handleEntityNotFoundException(EntityNotFoundException ex){
        return new ResponseEntity<>(
                ErrorDto.builder().code(404).message(ex.getMessage()).build(), HttpStatus.NOT_FOUND
        );
    }

    @ExceptionHandler
    protected ResponseEntity<ErrorDto> handleBadRequestException(BadRequestException ex){
        return new ResponseEntity<>(
                ErrorDto.builder().code(400).message(ex.getMessage()).build(), HttpStatus.BAD_REQUEST
        );
    }
}
