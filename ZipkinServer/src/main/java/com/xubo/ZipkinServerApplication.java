package com.xubo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @author 真的太难啦！
 * @date 2022-11-01 19:55:55
 * @description
 */
@SpringBootApplication
@EnableZipkinServer //声明启动zipkin server
public class ZipkinServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication.class,args);
    }
}
