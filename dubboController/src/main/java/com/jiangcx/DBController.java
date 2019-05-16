package com.jiangcx;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DBController {

    @Resource
    private DBService service;

    @RequestMapping("/getInfo/{name}")
    @ResponseBody
    public String getInfo(@PathVariable("name") String name){
        String value = service.getData(name);
        System.out.println(value);
        return value;
    }
}
