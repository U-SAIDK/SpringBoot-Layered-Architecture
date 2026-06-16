/// Centralized location for handling exceptions. Annotation: @RestControllerAdvice
/// Instead of writing try-catch blocks inside every controller, Spring automatically redirects exceptions here.


package com.example.springboot2.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

// @RestControllerAdvice -> This class acts as a GLOBAL exception handler.
@RestControllerAdvice
public class GlobalExceptionHandler {

//  @ExceptionHandler(ResourceNotFoundException.class) -> Whenever a ResourceNotFoundException
// occurs anywhere in the application,Spring automatically calls this method.
    @ExceptionHandler(ResourceNotFoundException.class)

    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex, HttpServletRequest request) {

ErrorResponse error = new ErrorResponse(LocalDateTime.now(), 404, "NOT_FOUND", ex.getMessage(), request.getRequestURI());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
