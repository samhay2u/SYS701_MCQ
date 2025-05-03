package com.example.mcq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//
//
//@SpringBootApplication annotation is a convenience annotation that adds:
//
//@Configuration: Tags the class as a source of bean definitions
//@EnableAutoConfiguration: Tells Spring Boot to add beans based on
// classpath settings
//@ComponentScan: Tells Spring to scan for components in the current
// package and its sub-packages
@SpringBootApplication
public class Sys701McqApplication {
    public static void main(String[] args) {
        SpringApplication.run(Sys701McqApplication.class, args);
    }
}