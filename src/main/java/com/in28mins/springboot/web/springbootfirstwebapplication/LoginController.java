package com.in28mins.springboot.web.springbootfirstwebapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {

    @RequestMapping("/login")
    @ResponseBody
    public String LoginMessage (){

        return "Hello World neu";

    }

}