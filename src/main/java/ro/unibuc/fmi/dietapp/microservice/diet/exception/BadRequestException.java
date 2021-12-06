package ro.unibuc.fmi.dietapp.microservice.diet.exception;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String message){
        super(message);
    }
}
