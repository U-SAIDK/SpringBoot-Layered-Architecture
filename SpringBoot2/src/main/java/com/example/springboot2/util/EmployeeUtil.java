/// The Util (Utility) Layer contains helper classes and reusable methods that can be used
/// across multiple layers of the application.


package com.example.springboot2.util;

import java.util.UUID;



public class EmployeeUtil {


// We are using a Static Method because it can be called directly:
// without creating an object out of it (EmployeeUtil.generateEmployeeCode();
    public static String generateEmployeeCode() {

        return "EMP-" +
                UUID.randomUUID()
                        .toString()
                        .substring(0,8)
                        .toUpperCase();
    }

}

//    Most Common util classes
//    ├── DateUtil
//    ├── StringUtil
//    ├── ValidationUtil
//    ├── JwtUtil
//    ├── FileUtil
//    ├── EncryptionUtil
//    ├── PasswordUtil
//    ├── EmployeeUtil
//    ├── ResponseUtil
//    └── MappingUtil