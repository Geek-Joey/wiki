package com.joey.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author joey
 * @create 2022-04-30 6:08 下午
 */
@RestController
public class TestController {

    //@RequestMapping("/hello")
    @GetMapping ("/hello")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/hello/post")
    public String helloPost(Map<String,String> map){
        //TODO 传参map问题未解决
        return "Hello World! Post: " + map.get("name");
    }
}
