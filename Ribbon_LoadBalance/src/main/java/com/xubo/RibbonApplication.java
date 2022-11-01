package com.xubo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.xml.namespace.QName;

/**
 * @author 真的太难啦！
 * @date 2022-11-01 10:51:17
 * @description
 */
@SpringBootApplication
public class RibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }
    @Bean
    @LoadBalanced   //声明⼀个基于 Ribbon 的负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}

