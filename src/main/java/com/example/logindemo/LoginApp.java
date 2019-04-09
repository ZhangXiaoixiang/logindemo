package com.example.logindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginApp {

    public static void main(String[] args) {
        SpringApplication.run(LoginApp.class, args);
        System.out.println("端口号:8081"+"  http://localhost:8081/gologin");
        System.out.println("端口号:8081"+"  http://localhost:8081/admin/add");
    }

}
