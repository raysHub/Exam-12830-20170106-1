package com.ray.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ray.service.CustomerService;

@RestController
@RequestMapping("/user")
public class CustomerController {
    @Autowired
    private CustomerService costumerService;
    
    @RequestMapping(path="/login", method = RequestMethod.GET)
    public String login(@RequestParam (name = "userName", required = false, defaultValue = "")  String userName){
            if(costumerService.getByName(userName)){
                return "success";
            } else {
                return "用户名输入错误,请确认后输入";
            }
    }
}
