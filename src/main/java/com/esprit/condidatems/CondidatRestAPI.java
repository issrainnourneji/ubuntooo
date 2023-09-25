package com.esprit.condidatems;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CondidatRestAPI {

    private String hello = "hello, i'am the condidat MS";
     @RequestMapping("/hello")
    public String sayHello(){
        return hello;
            }

}
