package com.iosnasu.hrmanagementmock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HrmanagementmockApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(HrmanagementmockApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(HrmanagementmockApplication.class);
    }
}
