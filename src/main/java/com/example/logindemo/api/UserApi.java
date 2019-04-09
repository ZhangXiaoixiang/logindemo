package com.example.logindemo.api;

import com.example.logindemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserApi {
    @RequestMapping("/gologin")
    public String gologin(){
        System.out.println("gologin---------------");
        return "login";
    }

    @RequestMapping("/login")
    public String login(User user, HttpSession session, HttpServletRequest request){
        System.out.println("登录成功就去首页  user"+user);
        if ("zxx".equals(user.getName())&&"1234".equals(user.getPassword())){
            session.setAttribute("name",user.getName());
            session.setAttribute("possword",user.getPassword());
            session.setAttribute("user",user);
            //session.setMaxInactiveInterval(10);//单位秒
            session.setMaxInactiveInterval(2*60);//单位秒
            System.out.println("Cookie 的 jsessionid ="+request.getSession().getId());
            return "index";
        }else {
            return "login";
        }

    }


}
