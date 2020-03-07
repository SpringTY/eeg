package com.spring.eeg;

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
