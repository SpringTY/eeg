package com.spring.eeg.mbg.model;

import java.math.BigDecimal;

public class Planstat {
    private Integer userid;

    private Long finished;

    private Long important;

    private Long trash;

    private BigDecimal realtime;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Long getFinished() {
        return finished;
    }

    public void setFinished(Long finished) {
        this.finished = finished;
    }

    public Long getImportant() {
        return important;
    }

    public void setImportant(Long important) {
        this.important = important;
    }

    public Long getTrash() {
        return trash;
    }

    public void setTrash(Long trash) {
        this.trash = trash;
    }

    public BigDecimal getRealtime() {
        return realtime;
    }

    public void setRealtime(BigDecimal realtime) {
        this.realtime = realtime;
    }
}