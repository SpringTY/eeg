package com.spring.eeg.controller;

import com.spring.eeg.service.EEGStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EEGController {
    @Autowired
    EEGStatisticService EEGStatisticService;

}
