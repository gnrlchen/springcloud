package com.example.provider2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author BryanChan
 * @Date 2019/7/4 18:32
 * @CreatedFor CRCBank
 * @Version 1.0
 */

@RestController
public class Demo1Controller {

    @RequestMapping("/hello")
    public String method2(){
        System.out.println("##################");
        return "hello2";
    }

}
