package com.xubo.feign.impl;

import com.xubo.bean.Result;
import com.xubo.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 真的太难啦！
 * @date 2022-11-01 12:17:13
 * @description
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public List<Result> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中………………………………………………";
    }
}
