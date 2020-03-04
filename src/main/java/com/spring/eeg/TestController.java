package com.spring.eeg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @ResponseBody
    @RequestMapping(value = "getLastWeek")
    public Pair getLastWeek() {
        System.out.println("TAG: getLastWeek");
        return Pair.getPair(20,20);
    }
}
