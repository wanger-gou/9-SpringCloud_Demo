package com.xubo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author 真的太难啦！
 * @date 2022-11-01 06:05:21
 * @description
 */
@SpringBootApplication
public class EurekaClient_ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClient_ConsumerApplication.class,args);
    }

    @Bean
    public RestTemplate getTestTemplate(){
        return new RestTemplate();
    }
}
