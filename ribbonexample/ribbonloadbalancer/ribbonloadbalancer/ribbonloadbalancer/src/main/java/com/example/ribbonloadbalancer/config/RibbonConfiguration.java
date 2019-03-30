package com.example.ribbonloadbalancer.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AvoidScan
public class RibbonConfiguration {

    @Autowired
    IClientConfig config;

    @Bean
    public IRule ribbonRule(IClientConfig config){
        // RandomRule 随机选择server
        //RoundRobinRule 按顺序循环选择Server
        //RetryRule 在一个配置时间段内当选择server 不成功,则一直尝试选择一个可用的server
        //BestAvailableRule 逐个考察server,如果server断路器打开，则忽略，再选择其中并发链接最低的server
        //AvailabilityFilteringRule 过滤掉一直连接失败并被标记为circuit tripped 的server,
        // 过滤掉那些高并发连接的server(active connections 超过配置的阈值)
        //ZoneAvoidanceRule 综合判断server 所在区域的性能和server的可用性轮询选择server,
        // 并且判断一个AWS Zone 的运行性能Zone 中的所有server


        return new RandomRule();
    }
}
