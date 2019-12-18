package com.springcloud.springcloudclient02.ded.controller;


import ded.springcloudclientconsumer02.com.ded.fallback.HystrixFallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hystrix")
public class HystrixController {

    @Autowired
    private HystrixFallback hystrixFallback;

    @ResponseBody
    @RequestMapping("/hello03")
    public String hello03() {
        return hystrixFallback.hello03();
    }
}
