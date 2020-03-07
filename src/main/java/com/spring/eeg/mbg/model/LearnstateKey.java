package com.spring.eeg.mbg.model;

import java.util.Date;

public class LearnstateKey {
    private Integer userid;

    private Date learndate;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getLearndate() {
        return learndate;
    }

    public void setLearndate(Date learndate) {
        this.learndate = learndate;
    }
}