package com.example.ribbon.sevice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author cy
 * @Date 2019/7/16 9:20
 * @Version 1.0
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallErrorBack")
    public String helloService(){
        return restTemplate.getForEntity("http://hello-service/hello",String.class).getBody();
    }

    public String fallerrorback(){
        return "error";
    }
}
