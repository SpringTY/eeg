package com.spring.eeg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.spring.eeg.mbg.dao")
@SpringBootApplication
public class EegApplication {

    public static void main(String[] args) {
        SpringApplication.run(EegApplication.class, args);
    }

}
