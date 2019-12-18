package com.springcloud.springcloudeureka03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEureka03Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEureka03Application.class, args);
    }

}
