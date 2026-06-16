///  Annotations in Java are a form of metadata that provide additional information about program elements
///  (classes, methods, fields, parameters, etc.) without directly affecting the program's business logic.
///  Annotations don't do anything by themselves; they become powerful when some tool or framework interprets them (Spring)

package com.example.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//  @SpringBootApplication is a convenience annotation that combines @Configuration, @EnableAutoConfiguration, and
//  @ComponentScan, making the class the main configuration and bootstrap entry point of a Spring Boot application.

@SpringBootApplication
public class SpringBoot2Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringBoot2Application.class, args);
    }   
}