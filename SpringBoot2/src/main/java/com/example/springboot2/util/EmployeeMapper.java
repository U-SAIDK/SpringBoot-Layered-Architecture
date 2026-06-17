package com.example.springboot2.util;

import com.example.springboot2.dto.EmployeeDTO;
import com.example.springboot2.entity.Employee;

/*
 * =====================================================
 * EMPLOYEE MAPPER UTILITY
 * =====================================================
 *
 * Purpose:
 * Convert Entity ↔ DTO
 *
 * Keeps conversion logic outside Service Layer.
 *
 */

public class EmployeeMapper {

    /*
     * Entity → DTO
     */
    public static EmployeeDTO toDTO(Employee employee) {

        return new EmployeeDTO(
                employee.getId(),
                employee.getName(),
                employee.getDept(),
                employee.getAge()
        );
    }

    /*
     * DTO → Entity
     */

    public static Employee toEntity(EmployeeDTO dto) {

        if (dto == null) {
            return null;
        }

        return new Employee(
                dto.getId(),
                dto.getName(),
                dto.getDept(),
                dto.getAge()

        );
    }
}