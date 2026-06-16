package com.example.springboot2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    /*
     * ENTITY
     *
     * Represents a database table.
     *      |
     * Employee Object
     *      ↓
     * Employee Table Row
     */

    @Id
    private Integer id;

    private String name;
    private String dept;
    private Integer age;



//  JPA requires a default constructor.
    public Employee() {
    }

    public Employee(Integer id,
                    String name,
                    String dept,
                    Integer age) {

        this.id = id;
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

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

    public void setAge(Integer age)  {
        this.age = age;
    }
}