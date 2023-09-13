package com.example.petclinicdemo;

public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(Long id) {
        super("Customer doesnt exist " + id);
    }
}