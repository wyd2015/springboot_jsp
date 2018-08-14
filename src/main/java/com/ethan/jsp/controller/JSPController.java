package com.ethan.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JSPController {

    @GetMapping("/jsp")
    public String getJsp(int n){
        int i = 1/n;
        return "index"; //返回的是jsp文件的文件名，不可带后缀
    }

}
