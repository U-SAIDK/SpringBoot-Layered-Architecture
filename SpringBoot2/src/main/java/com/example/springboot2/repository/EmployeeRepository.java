package com.example.springboot2.repository;

import com.example.springboot2.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    /*
     * REPOSITORY LAYER
     *
     * Responsible for:
     * - Database access
     * - Queries
     * - Data retrieval
     *
     * In real projects:
     *
     * SELECT * FROM employee
     * WHERE id = ?
     *
     * Here we are mocking data.
     */

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