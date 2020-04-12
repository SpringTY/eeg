package com.spring.eeg.controller;

import com.spring.eeg.Model.AdminService;
import com.spring.eeg.Model.User;
import com.spring.eeg.mbg.model.ClassTable;
import com.spring.eeg.mbg.model.Plan;
import com.spring.eeg.mbg.model.Userlogin;
import com.spring.eeg.service.PlanService;
import com.spring.eeg.service.SocialService;
import com.spring.eeg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;
    @Autowired
    PlanService planService;
    @Autowired
    UserService userService;
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
    public String addStudent(Map<String,Object>map){
        User user =userService.getCurrentUser();
        if(user == null){
            return "/error403";
        }
        List<ClassTable> list = adminService.getClassTables(user.getUserid());
        map.put("classTables",list);
        return "addStudent.html";
    }
    @RequestMapping(value = "/admin/submitNewClass")
    @ResponseBody
    public String submitNewClass(@RequestParam(value = "className")String className){
        System.out.println(className);
//
        User user =userService.getCurrentUser();
        if(user == null){
            return null;
        }
        adminService.addClass(user.getUserid(),className,user.getUsername());
        return "success";
    }
    @RequestMapping(value = "/admin/getClassList")
    @ResponseBody
    public List<ClassTable> getClassList(){
        User user =userService.getCurrentUser();
        if(user == null){
            return null;
        }
        return adminService.classList(user.getUserid());
    }
    @RequestMapping(value = "/admin/class/{classId}")
    public String getClassById(@PathVariable(value = "classId")Integer classId, Map<String,Object> map){
        List<Userlogin> students = adminService.getStudent(classId);
        map.put("students",students);
        return "adminClass.html";
    }
    @RequestMapping(value = "/admin/student/{studentId}")
    public String getStudentById(@PathVariable(value = "studentId")Integer studentId, Map<String,Object> map){
        List<Plan> plans = planService.getPlans(studentId);
        Userlogin userLogin = userService.getUser(studentId);
        map.put("plans",plans);
        map.put("userInfo",userLogin);

        return "adminStudent.html";
    }
    @RequestMapping(value = "/admin/addStudentToClass")
    public String addStudentToClass(@RequestParam(value = "studentId")Integer studentId, Map<String,Object> map){

        return "adminStudent.html";
    }

}
