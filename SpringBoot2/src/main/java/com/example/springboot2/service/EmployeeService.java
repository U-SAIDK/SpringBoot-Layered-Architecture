package com.example.springboot2.service;

import com.example.springboot2.dto.EmployeeDTO;
import com.example.springboot2.entity.Employee;
import com.example.springboot2.exception.ResourceNotFoundException;
import com.example.springboot2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/// SERVICE LAYER:- Responsible for: Business Logic, Validation, Data Transformation , Entity ↔ DTO Conversion
@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

// We create Variables whose value is provided in Resources
    @Value("${employee.company-name}")
    private String companyName;
    @Value("${employee.location}")
    private String location;



    public EmployeeDTO getEmployee(Integer id) {

/// Asking Repository for Data and if doesn't exit -> Throw custom error through Config layer
        Employee employee = employeeRepository.getEmployee(id);
        if(employee == null){
            throw new ResourceNotFoundException(
                    "Employee Not Found");
        }


/// Convert Entity -> DTO as we don't return entity values directly
        EmployeeDTO employeeDTO = new EmployeeDTO(
                        employee.getId(),
                        employee.getName(),
                        employee.getDept(),
                        employee.getAge()
                );

// Return DTO
        return employeeDTO;
    }
}