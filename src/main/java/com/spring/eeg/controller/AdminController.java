package com.spring.eeg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {
    @RequestMapping(value = "/admin/index")
    public String adminIndex(){
        return "adminIndex.html";
    }
    @RequestMapping(value = "/admin/classList")
    public String classList(){
        return "classList.html";
    }
    @RequestMapping(value = "/admin/newClass")
    public String newClass(){
        return "newClass.html";
    }
    @RequestMapping(value = "/admin/addStudent")
    public String addStudent(){
        return "addStudent.html";
    }
    @RequestMapping(value = "/admin/submitNewClass")
    @ResponseBody
    public String submitNewClass(@RequestParam(value = "className")String className){
        System.out.println(className);
        return "success";
    }
}
