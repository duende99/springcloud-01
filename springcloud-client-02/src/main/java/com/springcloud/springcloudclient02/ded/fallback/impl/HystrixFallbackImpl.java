package com.springcloud.springcloudclient02.ded.fallback.impl;

import com.springcloud.springcloudclient02.ded.fallback.HystrixFallback;
import org.springframework.stereotype.Component;

@Component
public class HystrixFallbackImpl implements HystrixFallback {

    @Override
    public String hello03() {

        System.out.println("====================Hystrix 熔断了");
        return "Hystrix 熔断了";
    }
}
