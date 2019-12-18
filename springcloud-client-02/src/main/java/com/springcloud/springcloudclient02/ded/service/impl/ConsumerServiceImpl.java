package com.springcloud.springcloudclient02.ded.service.impl;

import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl { //implements ConsumerService {

//    @Override
    public String hello01() {
        return "consumer  hello--01";
    }

//    @Override
    public String hello02(String name) {
        return "consumer  hello--02";
    }
}
