package com.sean.diancan.controller;

import com.sean.diancan.pojo.Customer;
import com.sean.diancan.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private CustomerServices customerServices;
    @RequestMapping(value = "/")
    public String hello() {
        return "Hello World";
    }
    @RequestMapping(value = "/j")
    public Customer hhh() {
        return customerServices.getCutomerbyName("1");
    }
}
