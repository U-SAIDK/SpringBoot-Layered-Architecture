package com.example.springboot2.repository;

import com.example.springboot2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * =====================================================
 * REPOSITORY LAYER
 * =====================================================
 *
 * Responsibilities:
 *
 * 1. Database Communication
 * 2. CRUD Operations
 * 3. Query Execution
 * 4. Data Retrieval
 * 5. Data Persistence
 *
 * Spring Data JPA automatically provides:
 *
 * save()
 * findById()
 * findAll()
 * deleteById()
 * existsById()
 * count()
 *
 * No implementation required.
 *
 */


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    /*
     *  public -> Access Modifier ( Accessible from any package).
     *  EmployeeRepository -> Repository Interface Name.Handles Employee database operations
     *  extends-> Inherits Methods/functionality from JpaRepository.
     *  JpaRepository -> Spring Data JPA Interface, Provides built-in CRUD methods.
     *  Generic Parameters:- Employee -> Entity Class managed by repository.
     *                      Integer -> Primary Key (ID) data type of Employee entity.
     */

}