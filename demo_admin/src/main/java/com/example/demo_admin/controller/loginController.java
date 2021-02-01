package com.example.demo_admin.controller;

import com.example.demo_admin.bean.User;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * @author wang
 * @create 2021-01-28 22:25
 */
@Controller
public class loginController {

    @GetMapping(value = {"/","/login"})
    public String login(){

        return "login";
    }

    @PostMapping("/login")
    public String index(User user, HttpSession session, Model model){

        if("aa".equals(user.getUsername())&&"123".equals(user.getPassword())){
            session.setAttribute("loginUser",user);
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg", "用户名或密码为空");
            return "login";

        }



    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model){

//        //判断是否登录
//        Object loginUser = session.getAttribute("loginUser");
//        if (loginUser != null) {
//
//            //去main页面
//            return "main";
//        } else {
//            model.addAttribute("msg", "没有登录，请重新登录");
//            //返回登录页
//            return "login";
//        }
        //使用拦截器，故不需要判断是否登录
        return  "main";
    }

}
