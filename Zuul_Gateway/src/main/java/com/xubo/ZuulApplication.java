package com.xubo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 真的太难啦！
 * @date 2022-11-01 07:43:45
 * @description
 */
@EnableZuulProxy //包含了@EnableZuulServer，设置该类是网关的启动类
@EnableAutoConfiguration//可帮助springBoot应用将所有符合条件的 @Configuration 配置类加载到当前springBoot所创建的IOC容器中。
/*无需添加 @SpringBootApplication 注解*/
public class ZuulApplication  {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
