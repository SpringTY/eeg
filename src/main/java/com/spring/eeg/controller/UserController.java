package com.spring.eeg.controller;

import com.spring.eeg.mbg.model.Userlogin;
import com.spring.eeg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/register")
    public String register() {
        return "register.html";
    }

    @PostMapping(value = "/registerAction")
    public String registerAction(Userlogin userlogin) {
        userService.registerNormalUser(userlogin);
        return "/login";
    }

    @RequestMapping(value = "/loginPage")
    public String loginPage(){
        return "login.html";
    }

    @RequestMapping(value = "/index")
    public String index(Map<String, Object> map) {
        System.out.println("con");
        map.put("mass", "1");
        return "index.html";
    }
    @RequestMapping(value = "/error403")
    public String error403(){

        return "error403.html";
    }
}
