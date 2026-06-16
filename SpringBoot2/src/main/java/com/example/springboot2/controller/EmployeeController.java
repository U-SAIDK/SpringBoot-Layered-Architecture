package com.example.springboot2.controller;

import com.example.springboot2.dto.EmployeeDTO;
import com.example.springboot2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    /// Dependency Injection
    // Spring injects EmployeeService bean here.
    // Controller should not directly communicate with Repository.
    // Request -> Controller -> Service -> Repository

    @Autowired
    EmployeeService employeeService;

    /// API Endpoint
    // Example Request:
    // GET http://localhost:8080/getEmployee/101
    @GetMapping("getEmployee/{id}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable Integer id) {
    /// @PathVariable
        // Extracts value from URL.
        // URL:
        // /getEmployee/101
        // id = 101

        /// Service Layer Call
        // Controller delegates business logic to Service.
        EmployeeDTO employee = employeeService.getEmployee(id);

        /// ResponseEntity<String> represents the complete HTTP Response.
        // It contains:- Response Body, HTTP Status Code, Headers (optional)
        // Here: Body   -> employee ; Status -> 200 OK
        return ResponseEntity.ok(employee);
    }

}

//    CLIENT
//       │
//       │ GET /getEmployee/101
//       ▼
//
//    CONTROLLER
//       │
//       │ employeeService.getEmployee(101)
//       ▼
//
//    SERVICE
//       │
//       │ employeeRepository.getEmployee(101)
//       ▼
//
//    REPOSITORY
//       │
//       │ Fetch Employee
//       ▼
//
//    EMPLOYEE ENTITY
//       │
//       ▼
//
//    SERVICE
//       │
//       │ Convert Entity → DTO
//       ▼
//
//    EMPLOYEE DTO
//       │
//       ▼
//
//    CONTROLLER
//       │
//       │ ResponseEntity.ok(dto)
//       ▼
//
//    SPRING/JACKSON
//       │
//       │ Converts DTO → JSON
//       ▼
//
//    CLIENT RESPONSE
//
//    {
//            "id":101,
//            "name":"Usaid",
//            "dept":"IT",
//            "age":21
//            }