package lections.com.globoforce.homework.util;

public class AwardValueException extends Exception{
        public AwardValueException() {
        }

        private String errorCode = "Unknown_Exception has been thrown ";


    public AwardValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public AwardValueException(String message) {
        super(message);
    }
    public AwardValueException (String message, String errorCode){
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
