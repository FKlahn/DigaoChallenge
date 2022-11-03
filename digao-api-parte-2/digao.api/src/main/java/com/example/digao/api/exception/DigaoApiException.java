package com.example.digao.api.exception;

public class DigaoApiException extends RuntimeException{
    public DigaoApiException(String message) {
            super(message);
        }
    public DigaoApiException() {
            super();
        }
}
