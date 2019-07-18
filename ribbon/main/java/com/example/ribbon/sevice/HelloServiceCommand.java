package com.example.ribbon.sevice;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author cy
 * @Date 2019/7/17 15:47
 * @Version 1.0
 */
public class HelloServiceCommand extends HystrixCommand<String>{

    private RestTemplate restTemplate;

    public HelloServiceCommand(String commandGroupKey, RestTemplate restTemplate) {
        super(HystrixCommandGroupKey.Factory.asKey(commandGroupKey));
        this.restTemplate = restTemplate;
    }

    @Override
    protected String run() throws Exception {
        System.out.println(" 线程："+Thread.currentThread().getName());
        return restTemplate.getForEntity("http://hello-service/hello",String.class).getBody();
    }

    @Override
    public String getFallback(){
        return "error";
    }

}
