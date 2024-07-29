package com.mo.categoryservice.exceptions;

public class CategoryAlreadyExistsException extends Exception{
    public CategoryAlreadyExistsException(String message) {
        super(message);
    }
}
