package com.springcloud.springcloudclient02.ded.fallback;

import com.springcloud.springcloudclient02.ded.fallback.impl.HystrixFallbackImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


//注：熔断器是作用在调用客户端的
@FeignClient(value = "springcloud-client-provider", fallback = HystrixFallbackImpl.class)
public interface HystrixFallback {

    @RequestMapping("/provider01/hello03")
    public String hello03();
}
