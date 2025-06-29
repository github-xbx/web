package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/jenkins")
public class JenkinsController {



    private final static String STR  = "啊哈哈哈哈哈哈哈哈哈哈哈哈哈";




    @GetMapping("select")
    public Map<String, Object> select(){

        Map<String, Object> map = new HashMap<>();

        map.put("list", Arrays.asList("haha","aaa","eeee","abcd"));
        map.put("string","jenkins 流水线构建");
        map.put("integer",123);


        return map;


    }


}
