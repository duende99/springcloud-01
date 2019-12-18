package com.springcloud.springcloudprovider02.com.ded;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider01")
public class HelloProvider02 {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello I am privider--02";
    }

    @RequestMapping("/hello02")
    @ResponseBody
    public String hello02(@RequestParam("name") String name) {

        return "hello I am privider--02" + "  " + name;
    }

    @RequestMapping("/hello03")
    @ResponseBody
    public String hello02() {
        return "hello I am privider-hystrix-02" + "  ";
    }
}
