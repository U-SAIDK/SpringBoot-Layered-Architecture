package com.example.springboot2.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    public static String getCurrentDateTime() {

        return LocalDateTime.now()
                .format(
                        DateTimeFormatter
                                .ofPattern(
                                        "dd-MM-yyyy HH:mm:ss"
                                )
                );
    }
}