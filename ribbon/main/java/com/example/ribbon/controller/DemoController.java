package com.example.ribbon.controller;

import com.example.ribbon.sevice.HelloService;
import com.example.ribbon.sevice.HelloServiceCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.concurrent.ExecutionException;

/**
 * @Author BryanChan
 * @Date 2019/7/4 18:32
 * @CreatedFor CRCBank
 * @Version 1.0
 */
@RestController
public class DemoController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer")
    public String consumer()throws ExecutionException, InterruptedException{
        HelloServiceCommand helloServiceCommand = new HelloServiceCommand("hello",restTemplate);
       return helloServiceCommand.execute();
    }
}
