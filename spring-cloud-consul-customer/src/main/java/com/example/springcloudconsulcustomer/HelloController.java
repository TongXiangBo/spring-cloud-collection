package com.example.springcloudconsulcustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private LoadBalancerClient loadBalancer;
    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 获取所有服务
     */
    @RequestMapping("/services")
    public Object services() {
        List<ServiceInstance> instances = discoveryClient.getInstances("service-provider");
        return instances;
    }

    /**
     * 从所有服务中选择一个服务（轮询）
     */

    @RequestMapping("/discover")
    public Object discover() {
        String s = loadBalancer.choose("service-provider").getUri().toString();
        return s;
    }

}
