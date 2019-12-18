package com.springcloud.springcloudprovider02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudProvider02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProvider02Application.class, args);
    }

}
