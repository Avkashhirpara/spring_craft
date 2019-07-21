package com.firstcraft.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SayHelloController {
    @RequestMapping("/helloThere")
    public String handleSayHelloRequest(){

        return "helloThere";
    }
}
