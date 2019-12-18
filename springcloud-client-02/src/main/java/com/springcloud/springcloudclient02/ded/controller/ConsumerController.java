package com.springcloud.springcloudclient02.ded.controller;

import ded.springcloudclientconsumer02.com.ded.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer02")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("/hello")
    @ResponseBody
    public String helloConsumer() {
        return consumerService.hello01();
    }

    @RequestMapping("/hello02")
    @ResponseBody
    public String helloConsumer02() {
        return consumerService.hello02("duende99");
    }
}

