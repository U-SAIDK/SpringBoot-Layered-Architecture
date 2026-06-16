package com.example.springboot2.util;

public class ValidationUtil {

    public static boolean isValidEmail(
            String email) {

        return email.contains("@");
    }

}