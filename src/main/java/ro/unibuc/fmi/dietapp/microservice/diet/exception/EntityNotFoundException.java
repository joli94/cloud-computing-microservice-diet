package ro.unibuc.fmi.dietapp.microservice.diet.exception;

public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException(String message){
        super(message);
    }
}
