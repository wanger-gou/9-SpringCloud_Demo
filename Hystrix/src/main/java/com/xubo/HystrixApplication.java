package com.xubo;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @author 真的太难啦！
 * @date 2022-11-01 14:19:19
 * @description
 */
@SpringBootApplication
@EnableFeignClients //声明springBoot项目是FeignClient实现的项目
@EnableCircuitBreaker//声明启用熔断机制
@EnableHystrixDashboard//声明启用可视化的数据监控
public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class,args);
    }

    /*HystrixDashboard可视化监控出现：Unable to connect to Command Metric Stream？
    * 特点：springBoot1.5是不会报该错误，springBoot2.0就会报上述错误
    * 解决：
    *     进入源代码中查看一下，发现spring2.0的一个Servlect被注释掉了，我们只要在自己的项目里配置上这个servlet
    *      在application.yml添加配置hystrix.dashboard.proxy-stream-allow-list: "*"
    *
    */
    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
