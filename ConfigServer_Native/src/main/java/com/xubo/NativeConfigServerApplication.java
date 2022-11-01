package com.xubo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author 真的太难啦！
 * @date 2022-11-01 16:03:42
 * @description
 */
@SpringBootApplication
@EnableConfigServer //声明配置中心
//该服务一旦启动，其就会给其他服务提供返回配置文件的服务
public class NativeConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServerApplication.class,args);
    }
}
