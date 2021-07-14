package task4;

public class ExceptionInput extends RuntimeException{

    String message;

    public ExceptionInput(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {

        return message;
    }
}
