package com.springboot.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/helloworld")
    public String helloworld(){
        return "hello world";
    }

    @GetMapping(path = "/helloworldBean")
    public HelloWorlBean helloworldBean(){
        return new HelloWorlBean("Welcome to Bean World");
    }

    @GetMapping(path = "/getName/{name}")
    public String helloWorldPath(@PathVariable String name){
        return String.format("hello world %S",name);
    }

}