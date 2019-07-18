package com.example.eureka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author BryanChan
 * @Date 2019/7/4 18:32
 * @CreatedFor CRCBank
 * @Version 1.0
 */
@RestController
@RequestMapping("/aadfaeureka")
public class DemoController {

    @RequestMapping("/method1")
    public String method1(){
        return "method1";
    }

}
