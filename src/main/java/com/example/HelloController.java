package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wzy on 2017/2/13.
 */
@RestController
@EnableAutoConfiguration
@Slf4j
public class HelloController {
    @RequestMapping("/")
    public String helloworld(){
        log.debug("访问hello");
        return "Hello world!";
    }

    @RequestMapping("/hello/{name}")
    public String hellName(@PathVariable String name){
        log.debug("访问helloName,Name={}",name);
        return "Hello "+name+"!!!";
    }
}

