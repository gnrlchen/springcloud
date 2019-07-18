package com.example.provider1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author BryanChan
 * @Date 2019/7/4 18:32
 * @CreatedFor CRCBank
 * @Version 1.0
 */
@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String method1(){
        System.out.println("!!!!!!!!!!!!!!!!!");
        return "hello1";
    }

}
