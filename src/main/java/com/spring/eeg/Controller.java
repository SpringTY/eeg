package com.spring.eeg;

import com.spring.eeg.Model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@CrossOrigin
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "/index")
    public String get(Map<String, Object> map) {
        System.out.println("con");
        map.put("mass", "1");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = (User)  authentication.getPrincipal();
        System.out.println(user);
        return "index.html";
    }

    @RequestMapping(value = "/document")
    public String document(Map<String, Object> map){
        Five five = new Five("1", "2", "3", "4", "5");
        Five five2 = new Five("1", "2", "3", "4", "5");
        List<Five> list = new ArrayList<>();
        list.add(five);
        list.add(five2);
        map.put("eegDocuments",list);
        System.out.println(map);
        System.out.println("/document + TAG");
        return "document.html";
    }
    @ResponseBody
    @RequestMapping(value = "/testA")
    public List testA(HttpServletRequest request, HttpServletResponse response){
        Five five = new Five("1", "2", "3", "4", "5");
        List list = new ArrayList();
        list.add(five);
        System.out.println("TAG: testA");
        return list;
    }

}
