package com.springcloud.springcloudprovider01.com.ded;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider01")
public class HelloProvider01 {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello I am privider--01";
    }

    @RequestMapping("/hello02")
    @ResponseBody
    public String hello02(@RequestParam("name") String name) {

        return "hello I am privider--01" + "  " + name;
    }

//    @RequestMapping("/hello03")
    @ResponseBody
    public String hello02() {
//        int i = 1/0;
        return "hello I am privider-hystrix-01" + "  ";
    }
}
