/// The Config Layer contains classes responsible for configuring application-wide settings, bean creation, and framework customization.
/// It centralizes application setup and allows Spring to manage custom objects through the IoC Container.
/// Most Important Annotation is @Configuration :- Marks a class as a Spring Configuration Class.
//  It tells Spring: What to Create ,How to Create , When to Create

package com.example.springboot2.config;

import org.springframework.context.annotation.Configuration;

// @Configuration -> scan this class , execute configuration methods, register beans
// Purpose: Central place for application configuration ; Spring loads this class during startup.
// Later this class may contain:@Bean methods,Security Configuration,Database Configuration, CORS Configuration, Swagger Configuration

@Configuration
public class AppConfig
{

}


//   Config Layer in Real Projects :-
//    ├── AppConfig
//    ├── SecurityConfig
//    ├── SwaggerConfig
//    ├── OpenApiConfig
//    ├── JwtConfig
//    ├── CorsConfig
//    ├── RedisConfig
//    ├── KafkaConfig
//    ├── DatabaseConfig







