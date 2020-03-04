package com.spring.eeg;

import lombok.Data;

@Data
public class Five {
    String one;
    String two;
    String three;
    String four;
    String five;

    public Five(String one, String two, String three, String four, String five) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
    }
}
