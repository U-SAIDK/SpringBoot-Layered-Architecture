package com.example.springboot2.dto;

//  DTO:- Data Transfer Object
//  Used for sending data between layers or API response.
//  Why DTO?
//  We should not expose Entity directly.
//  As these Class is not marked with Annotation @Entity it is simple a
//  class whereas Class Annotated with @Entity is Linked to Database
//  * Entity = Database Model  ; * DTO    = API Model


import lombok.Builder;
import lombok.Data;

// @Data
public class EmployeeDTO {

    private Integer id;
    private String name;
    private String dept;
    private Integer age;

    // No-Args Constructor
    public EmployeeDTO() {
    }

    // All-Args Constructor
    public EmployeeDTO(Integer id, String name, String dept, Integer age) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

/// As can use @Data -> lombok Library Getters,Setters , Parametarized Constructors are Automatically Added
