package com.springcloud.springcloudeureka01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEureka01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEureka01Application.class, args);
    }

}
