package com.dtdhehe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xie_东
 * @version 1.0.0
 * @date 2020/6/3 17:07
 * @description
 **/
@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello(){
        return "hello security!";
    }

}
