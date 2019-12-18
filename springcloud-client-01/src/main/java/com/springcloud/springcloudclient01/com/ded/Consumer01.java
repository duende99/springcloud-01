package com.springcloud.springcloudclient01.com.ded;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer01")
public class Consumer01 {
    public static final String applicationName = "springcloud-client-provider";

    @Resource
    private RestTemplate restTemplate;

    @ResponseBody
//    @RequestMapping(value = "/hello")
    public Object hello() {
        return restTemplate.getForObject("http://" + applicationName+"/provider01/hello", String.class);
    }

    @ResponseBody
    @RequestMapping(value = "/hello")
    public Object hello2() {
        return "consumer01---hello";
//        return restTemplate.getForObject("http://" + applicationName+"/provider01/hello", String.class);
    }

    @ResponseBody
    @RequestMapping(value = "/hello3")
    public Object hello3() {
        return "consumer01---hello3";
//        return restTemplate.getForObject("http://" + applicationName+"/provider01/hello", String.class);
    }
}
