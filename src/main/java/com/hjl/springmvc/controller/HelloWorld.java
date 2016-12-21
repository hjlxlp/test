package com.hjl.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2016/12/21.
 */
@Controller
@RequestMapping("/")
public class HelloWorld {

    @RequestMapping
    public String hello(){
        System.out.println("helloworld springmvc");
        return "hello";
    }

}
