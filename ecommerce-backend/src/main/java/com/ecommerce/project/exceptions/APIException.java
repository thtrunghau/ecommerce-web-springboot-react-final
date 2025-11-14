package com.ecommerce.project.exceptions;

/*in case create new data*/
public class APIException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public APIException() {}

    public APIException(String message) {
        super(message);
    }
}
