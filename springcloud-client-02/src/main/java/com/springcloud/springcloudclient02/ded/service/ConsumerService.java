package com.springcloud.springcloudclient02.ded.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "springcloud-client-provider")
public interface ConsumerService {

    @RequestMapping("/provider01/hello")
    public String hello01();

    @RequestMapping("/provider01/hello02")
    public String hello02(@RequestParam("name") String name);

}
