package com.example.flat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EntityScan(basePackages = "com.example.*")
@SpringBootApplication(scanBasePackages = "com.example.*")
@EnableFeignClients
public class FlatApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlatApplication.class, args);
    }

}
