package com.springcloud.springcloudclient01.com.ded;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@Configurable
public class RestConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


    /**
     * 配置随机负载策略
     */
//    @Bean
//    public IRule ribbonRule() {
//        return new RandomRule();
//    }
//    @Bean
//    public HttpHeaders getHeaders() { // 要进行一个Http头信息配置
//        HttpHeaders headers = new HttpHeaders(); // 定义一个HTTP的头信息
//        String auth = "studyjava:hello"; // 认证的原始信息
//        byte[] encodedAuth = Base64.getEncoder()
//                .encode(auth.getBytes(Charset.forName("US-ASCII"))); // 进行一个加密的处理
//        // 在进行授权的头信息内容配置的时候加密的信息一定要与“Basic”之间有一个空格
//        String authHeader = "Basic " + new String(encodedAuth);
//        headers.set("Authorization", authHeader);
//        return headers;
//    }
}
