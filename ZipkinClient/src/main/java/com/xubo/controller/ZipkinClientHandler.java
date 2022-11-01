package com.xubo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 真的太难啦！
 * @date 2022-11-01 20:13:44
 * @description
 */
@RestController
@RequestMapping("/zipkin")
public class ZipkinClientHandler {
    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return this.port;
    }
}
