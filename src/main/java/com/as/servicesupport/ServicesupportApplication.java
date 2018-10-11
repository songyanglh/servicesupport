package com.as.servicesupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServicesupportApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicesupportApplication.class, args);
    }
}
