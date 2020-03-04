package com.spring.eeg;

import com.spring.eeg.Model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

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


}
