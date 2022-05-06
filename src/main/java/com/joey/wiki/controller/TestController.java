package com.joey.wiki.controller;

import com.joey.wiki.entity.TestEntity;
import com.joey.wiki.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author joey
 * @create 2022-04-30 6:08 下午
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;

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

    @GetMapping ("/test/list")
    public List<TestEntity> list(){
        return testService.list();
    }


}
