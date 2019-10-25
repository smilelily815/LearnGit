package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/method")
    @ResponseBody
    public String method() {
        return "demo method";
    }

    @RequestMapping("/method1")
    @ResponseBody
    public String method1() {
        return "demo method1";
    }
}
