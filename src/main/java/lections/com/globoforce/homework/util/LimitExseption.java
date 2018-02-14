package lections.com.globoforce.homework.util;

public class LimitExseption  extends  Exception{

    private String errorCode = "Unknown_Exception has been thrown ";

    public LimitExseption() {
    }

    public LimitExseption(String message) {
        super(message);
    }

    public LimitExseption(String message, Throwable cause) {
        super(message, cause);
    }

    public LimitExseption (String message, String errorCode){
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }


}
