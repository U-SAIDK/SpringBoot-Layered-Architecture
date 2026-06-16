/// A custom exception is a user-defined exception class created by extending an existing exception class
/// (usually Exception or RuntimeException) to represent application-specific error conditions.
// Instead of throwing generic exceptions like:  NullPointerException , Exception , RuntimeException
// we create our own meaningful exception like : Employee Not Found , User Not Found , Product Not Found

package com.example.springboot2.exception;


// RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine.
public class ResourceNotFoundException extends RuntimeException{

// Constructor :- Receives a custom error message and passes it to the parent RuntimeException class.
 public ResourceNotFoundException(String message) {
    super(message);
    }

}
