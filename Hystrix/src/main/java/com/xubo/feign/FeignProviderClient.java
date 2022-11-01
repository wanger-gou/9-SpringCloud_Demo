package com.xubo.feign;

import com.xubo.bean.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author 真的太难啦！
 * @date 2022-11-01 11:52:31
 * @description
 */
@FeignClient(value = "provider")
//value属性：配置当前FeginClient访问的注册中心里被注册的微服务(组件会调用方法实现接口并将之注册到IOC容器中)
//fallback属性：配置FeignClient的降级处理实现类（若服务调用出错，则熔断调用降级处理类方法）
public interface FeignProviderClient {

    @GetMapping("/result/findAll")
    public List<Result> findAll();
    @GetMapping("/result/index")
    public String index();
}
