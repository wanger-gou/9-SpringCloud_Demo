package com.xubo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 真的太难啦！
 * @date 2022-11-01 02:18:39
 * @description
 */
@SpringBootApplication  //声明该类是springBoot的入口
@EnableEurekaServer //声明该类是一个Eureka Server微服务（注册中心），提供服务注册和服务发现功能。
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
