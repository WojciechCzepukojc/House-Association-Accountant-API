package com.example.flat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EntityScan(basePackages = "com.example.*")
@SpringBootApplication(scanBasePackages = "com.example.*")
public class FlatApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlatApplication.class, args);
    }

}
