package com.ecommerce.project.exceptions;

/*Throwable -> Exception -> RuntimeException -> ResourceNotFoundException
*whenever an exception ResourceNotFoundException is threw, it calls super()
* super(message) continues to call constructor of RuntimeException, then  one by one to Throwable to access
* .getMessage()
* ResourceNotFoundException is just a custom exception
* */
public class ResourceNotFoundException extends RuntimeException {
    String resourceName;
    String field;
    String fieldName;
    Long  fieldId;

    public ResourceNotFoundException() {
    }
    public ResourceNotFoundException(String resourceName, String field, String fieldName) {
        super(String.format("Resource %s not found for field %s: %s", resourceName, field, fieldName));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldName = fieldName;
    }

    public ResourceNotFoundException(String resourceName, String field, Long fieldId) {
        super(String.format("Resource %s not found for field %s: %d", resourceName, field, fieldId));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldId = fieldId;
    }
}
