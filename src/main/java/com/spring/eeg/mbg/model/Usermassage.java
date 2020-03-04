package com.spring.eeg.mbg.model;

import java.util.Date;

public class Usermassage {
    private Integer massageid;

    private Integer userfrom;

    private Integer userto;

    private String usermassage;

    private Integer readed;

    private Date sendtime;

    public Integer getMassageid() {
        return massageid;
    }

    public void setMassageid(Integer massageid) {
        this.massageid = massageid;
    }

    public Integer getUserfrom() {
        return userfrom;
    }

    public void setUserfrom(Integer userfrom) {
        this.userfrom = userfrom;
    }

    public Integer getUserto() {
        return userto;
    }

    public void setUserto(Integer userto) {
        this.userto = userto;
    }

    public String getUsermassage() {
        return usermassage;
    }

    public void setUsermassage(String usermassage) {
        this.usermassage = usermassage == null ? null : usermassage.trim();
    }

    public Integer getReaded() {
        return readed;
    }

    public void setReaded(Integer readed) {
        this.readed = readed;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }
}