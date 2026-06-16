package com.example.springboot2.service;

import com.example.springboot2.config.EmployeeConfigProperties;
import com.example.springboot2.dto.EmployeeDTO;
import com.example.springboot2.entity.Employee;
import com.example.springboot2.exception.ResourceNotFoundException;
import com.example.springboot2.repository.EmployeeRepository;
import com.example.springboot2.util.DateUtil;
import com.example.springboot2.util.EmployeeUtil;
import org.springframework.stereotype.Service;

/*
 * =====================================================
 * SERVICE LAYER
 * =====================================================
 *
 * Responsibilities:
 *
 * 1. Business Logic
 * 2. Validation
 * 3. Entity ↔ DTO Conversion
 * 4. Calling Repository Layer
 * 5. Using Utility Classes
 * 6. Throwing Custom Exceptions
 *
 * Flow:
 *
 * Controller
 *     ↓
 * Service
 *     ↓
 * Repository
 *
 */
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeConfigProperties config;

    /*
     * Constructor Injection
     *
     * Spring automatically injects required beans.
     */
    public EmployeeService(
            EmployeeRepository employeeRepository,
            EmployeeConfigProperties config) {

        this.employeeRepository = employeeRepository;
        this.config = config;
    }

    /*
     * Main Business Method
     *
     * Fetch Employee
     * Validate
     * Convert Entity -> DTO
     * Return DTO
     */
    public EmployeeDTO getEmployee(Integer id) {

        // Fetch employee from repository
        Employee employee = employeeRepository.getEmployee(id);

        // Business Validation
        if (employee == null) {
            throw new ResourceNotFoundException(
                    "Employee Not Found With ID : " + id
            );
        }

        /*
         * UTIL LAYER USAGE
         */

        // Generate Employee Tracking Code
        String employeeCode =
                EmployeeUtil.generateEmployeeCode();

        // Current Request Timestamp
        String requestTime =
                DateUtil.getCurrentDateTime();

        /*
         * Demo Logs
         */
        System.out.println("Employee Code : "
                + employeeCode);

        System.out.println("Request Time : "
                + requestTime);

        System.out.println("Company Name : "
                + config.getCompanyName());

        System.out.println("Location : "
                + config.getLocation());

        /*
         * Entity → DTO Conversion
         */
        return new EmployeeDTO(
                employee.getId(),
                employee.getName(),
                employee.getDept(),
                employee.getAge()
        );
    }

    /*
     * Helper Method
     *
     * Shows loaded configuration.
     */
    public void displayApplicationConfig() {

        System.out.println(
                "Company : "
                        + config.getCompanyName());

        System.out.println(
                "Location : "
                        + config.getLocation());

        System.out.println(
                "Department : "
                        + config.getDepartment());
    }
}