package com.digitalinovationone.springboot.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloControler {
    @GetMapping("/hello1")
    public String mensagem(){
        return "hello satan";
    }
    @GetMapping("/hello2")
    public String mensagem1(){
        return "caralha";
    }
    //sdadadadasa
}
