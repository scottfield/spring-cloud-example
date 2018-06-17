package com.jackie.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoClient {
    @Value("${message}")
    private String message;

    public static void main(String[] args) {
        SpringApplication.run(DemoClient.class, args);
    }

    @RequestMapping("hello")
    public String helloWorld() {
        return message;
    }
}
