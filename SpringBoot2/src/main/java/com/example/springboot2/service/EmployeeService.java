package com.example.springboot2.service;

import com.example.springboot2.config.EmployeeConfigProperties;
import com.example.springboot2.dto.EmployeeDTO;
import com.example.springboot2.entity.Employee;
import com.example.springboot2.exception.ResourceNotFoundException;
import com.example.springboot2.repository.EmployeeRepository;
import com.example.springboot2.util.DateUtil;
import com.example.springboot2.util.EmployeeMapper;
import com.example.springboot2.util.EmployeeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


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
 * 4. Repository Communication
 * 5. Utility Usage
 * 6. Exception Handling
 *
 * Flow:
 *
 * Controller
 *      ↓
 * Service
 *      ↓
 * Repository
 *      ↓
 * PostgreSQL Database
 *
 */

@Slf4j
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeConfigProperties config;

    /*
     * Constructor Injection
     *
     * Spring automatically injects:
     * - EmployeeRepository Bean
     * - EmployeeConfigProperties Bean
     */

///  Constructor Injection :- As we Declared the object final we will use COnstructor injection
//   Field injection @Autowired is not safe as the variables are not declared final
    public EmployeeService(
            EmployeeRepository employeeRepository,
            EmployeeConfigProperties config) {

        this.employeeRepository = employeeRepository;
        this.config = config;
    }
/// Logger class initialization
    Logger logger = LoggerFactory.getLogger(EmployeeService.class);


/// Fetch employee by id
//   public -> access modifier , EmployeeDTO -> Return Type , getEmployee -> Method Type ,
    public EmployeeDTO getEmployee(Integer id) {
        // TRACE
        log.trace("Entering getEmployee() method");

        // INFO
        log.info("Fetching employee with ID: {}", id);

        /*
         * Repository Layer Call
         *
         * Fetch employee from PostgreSQL.
         *
         * If not found:
         * Throw ResourceNotFoundException.
         */

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> {
                    log.error("Employee not found with ID: {}", id);
                    return new ResourceNotFoundException("Employee Not Found With ID : " + id);
                });



/// Util Layer Usage :-
        // Generate employee tracking code.
        String employeeCode = EmployeeUtil.generateEmployeeCode();

        // Generate current timestamp.
        String requestTime = DateUtil.getCurrentDateTime();
        // Demo(logs) utility Layer
        System.out.println("Employee Code : " + employeeCode);
        System.out.println("Company Name : " + config.getCompanyName());
        System.out.println("Location : " + config.getLocation());
        System.out.println("Request Time : " + requestTime);

// Entity -> DTO Conversion
        return EmployeeMapper.toDTO(employee);
    }


/// Config layer usage
    public void displayApplicationConfig() {

        System.out.println("Company : " + config.getCompanyName());

        System.out.println("Location : " + config.getLocation());

        System.out.println("Department : " + config.getDepartment());
    }






}