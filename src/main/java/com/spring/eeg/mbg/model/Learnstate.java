package com.spring.eeg.mbg.model;

public class Learnstate extends LearnstateKey {
    private Integer attentiontime;

    private Integer totaltime;

    public Integer getAttentiontime() {
        return attentiontime;
    }

    public void setAttentiontime(Integer attentiontime) {
        this.attentiontime = attentiontime;
    }

    public Integer getTotaltime() {
        return totaltime;
    }

    public void setTotaltime(Integer totaltime) {
        this.totaltime = totaltime;
    }
}