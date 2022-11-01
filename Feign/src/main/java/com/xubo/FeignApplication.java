package com.xubo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 真的太难啦！
 * @date 2022-11-01 11:46:19
 * @description
 */
@SpringBootApplication
@EnableFeignClients //声明springBoot项目是FeignClient实现的项目
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}
