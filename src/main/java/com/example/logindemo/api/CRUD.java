package com.example.logindemo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class CRUD {
    @RequestMapping("/add")
    public String add() {
        System.out.println("执行了add方法!");
        return "执行了add方法!";
    }
    @RequestMapping("/del")
    public String del() {
        System.out.println("执行了del方法!");
        return "执行了del方法!";
    }
    @RequestMapping("/update")
    public String update() {
        System.out.println("执行了update方法!");
        return "执行了update方法!";
    }
}
