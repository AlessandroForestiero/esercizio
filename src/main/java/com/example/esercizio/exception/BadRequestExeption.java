package com.example.esercizio.exception;

public class BadRequestExeption extends RuntimeException {
    public BadRequestExeption(String message){
        super(message);
    }
}
