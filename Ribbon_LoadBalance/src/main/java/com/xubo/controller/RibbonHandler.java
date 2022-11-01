package com.xubo.controller;

import com.xubo.bean.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 真的太难啦！
 * @date 2022-11-01 11:09:58
 * @description
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public List<Result> findAll(){
        //  用注册中心的微服务注册名替代该微服务的套接字
        return restTemplate.getForEntity("http://provider/result/findAll",List.class).getBody();
    }

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://provider/result/index",String.class);
    }
}
