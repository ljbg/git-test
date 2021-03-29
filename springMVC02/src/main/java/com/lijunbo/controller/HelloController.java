package com.lijunbo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HelloController {

    @RequestMapping("/h1")
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","hello SpringMVC");
        return "hello";   //会被视图解析器处理    相当于转发
    }

    @GetMapping("/hello/{a}/{b}")
    public String hello2(@PathVariable int a,@PathVariable int b, Model model){
        int result = a + b;
        model.addAttribute("msg","结果1是"+result);
        return  "test";
    }

    @PostMapping("/hello/{a}/{b}")       //对应不同的请求方式
    public String hello3(@PathVariable int a,@PathVariable int b, Model model){
        int result = a + b;
        model.addAttribute("msg","结果2是"+result);
        return  "test";
    }

    @RequestMapping("/h2")
    public String hello4(String name,Model model){
        System.out.println(name);
        //封装数据
        model.addAttribute("msg","hello SpringMVC");
        return "redirect:/index.jsp";   //会被视图解析器处理    相当于重定向
    }





}
