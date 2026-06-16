package com.example.springboot2.repository;

import com.example.springboot2.entity.Employee;
import org.springframework.stereotype.Repository;


/// @Repository:- Databae LAYER Responsible for:- Database access , Queries , Data retrieval
// CRUD IS PERFORMED HERE
@Repository
public class EmployeeRepository {


    public Employee getEmployee(Integer id) {

        System.out.println(
                "Fetching Employee from Database..."
        );

        return new Employee(
                1,
                "Usaid",
                "IT",
                21
        );
    }
}