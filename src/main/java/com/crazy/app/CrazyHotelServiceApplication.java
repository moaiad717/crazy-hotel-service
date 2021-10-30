package com.crazy.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = {"com.crazy"})
@EnableEurekaClient
public class CrazyHotelServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrazyHotelServiceApplication.class, args);
    }

}
