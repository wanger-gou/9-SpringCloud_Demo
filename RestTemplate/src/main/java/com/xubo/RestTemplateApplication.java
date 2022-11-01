package com.xubo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author 真的太难啦！
 * @date 2022-11-01 05:13:41
 * @description
 */
@SpringBootApplication
public class RestTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class,args);
    }
//   配置创建一个RestTemplate的Bean对象注入到IOC容器中
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
