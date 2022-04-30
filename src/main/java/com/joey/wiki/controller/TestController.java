package com.joey.wiki.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author joey
 * @create 2022-04-30 6:08 下午
 */
@RestController
public class TestController {

    //@RequestMapping("/hello")
    @PutMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
