package com.luv2code.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/showMyLoginPage")
    public String login(){
        //return "plain-login";
        return "fancy-login";
    }

    @GetMapping("access-denied")
    public String denied(){
        return "denied";
    }
}
