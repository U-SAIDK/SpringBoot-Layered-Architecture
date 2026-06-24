/// AppConfig -> earlier in Appconfig @Configuration and in service layer @Value was used
/// But in Real Enterprise config :- instead if @Value we use @ConfigurationProperties
///
// 1 Application Starts
// 2 application.properties or application.yml is loaded
// 3 Spring scans for @ConfigurationProperties classes
// 4 Prefix "employee" is identified
// 5 All employee.* properties are read
// 6 Values are mapped to matching fields
// 7 Spring creates and manages the bean
// 8 Bean becomes available for dependency injection
// 9 Configuration can be used anywhere in the application

package com.example.springboot2.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/// @Component -> Mark these class as Spring Managed Bean
/// @ConfigurationProperties -> binds external configuration values
///  (prefix = "employee") means all employee.* properties are mapped here.
// Eliminates the need for multiple @Value annotations.
@Component
@ConfigurationProperties(prefix = "employee")
public class EmployeeConfigProperties {

    private String companyName;
    private String location;
    private String department;
    private String email;
    private String phone;


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}