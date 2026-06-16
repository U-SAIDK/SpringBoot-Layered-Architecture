/// ErrorResponse is a DTO (Data Transfer Object), Its purpose is to send a structured
/// error response(JSON) back to the client instead of a confusing stack trace.


package com.example.springboot2.exception;

import java.time.LocalDateTime;


public class ErrorResponse {

    /*
     * Time when the error occurred.
     *
     * Example:
     * 2026-06-12T10:00:00
     */
    private LocalDateTime timestamp;

    /*
     * HTTP Status Code
     *
     * Example:
     * 404
     */
    private Integer status;

    /*
     * HTTP Status Name
     *
     * Example:
     * NOT_FOUND
     */
    private String error;

    /*
     * Actual error message.
     *
     * Example:
     * Employee Not Found
     */
    private String message;

    /*
     * API endpoint that caused the error.
     *
     * Example:
     * /employees/999
     */
    private String path;

    /*
     * Default Constructor
     *
     * Required by frameworks like Jackson
     * for object serialization/deserialization.
     */
    public ErrorResponse() {
    }

    /*
     * Parameterized Constructor
     *
     * Used for quickly creating an ErrorResponse object.
     */
    public ErrorResponse(
            LocalDateTime timestamp,
            Integer status,
            String error,
            String message,
            String path) {

        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    // Getters and Setters
}

//    JSON PRODUCED
//        {
//                "timestamp": "2026-06-12T10:00:00",
//                "status": 404,
//                "error": "NOT_FOUND",
//                "message": "Employee Not Found",
//                "path": "/employees/999"
//                }