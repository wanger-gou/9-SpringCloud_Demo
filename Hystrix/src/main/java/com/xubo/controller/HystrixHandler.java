package com.xubo.controller;

import com.xubo.bean.Result;
import com.xubo.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 真的太难啦！
 * @date 2022-11-01 14:33:29
 * @description
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {
    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public List<Result> findAll(){
        return feignProviderClient.findAll();
    }
    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
