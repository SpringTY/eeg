package com.spring.eeg.mbg.model;

import lombok.Data;

import java.util.Date;
@Data
public class Userlastweekstate {
    private Integer userid;

    public Userlastweekstate() {
    }

    public Userlastweekstate(Integer userid, Integer mondaytotaltime, Integer mondayattentiontime, Integer tuesdaytotaltime, Integer tuesdayattentiontime, Integer wednesdaytotaltime, Integer wednesdayattentiontime, Integer thursdaytotaltime, Integer thursdayattentiontime, Integer fridaytotaltime, Integer fridayattentiontime, Integer saturdaytotaltime, Integer saturdayattentiontime, Integer sundaytotaltime, Integer sundayattentiontime, Date lastupdate) {
        this.userid = userid;
        this.mondaytotaltime = mondaytotaltime;
        this.mondayattentiontime = mondayattentiontime;
        this.tuesdaytotaltime = tuesdaytotaltime;
        this.tuesdayattentiontime = tuesdayattentiontime;
        this.wednesdaytotaltime = wednesdaytotaltime;
        this.wednesdayattentiontime = wednesdayattentiontime;
        this.thursdaytotaltime = thursdaytotaltime;
        this.thursdayattentiontime = thursdayattentiontime;
        this.fridaytotaltime = fridaytotaltime;
        this.fridayattentiontime = fridayattentiontime;
        this.saturdaytotaltime = saturdaytotaltime;
        this.saturdayattentiontime = saturdayattentiontime;
        this.sundaytotaltime = sundaytotaltime;
        this.sundayattentiontime = sundayattentiontime;
        this.lastupdate = lastupdate;
    }

    private Integer mondaytotaltime;

    private Integer mondayattentiontime;

    private Integer tuesdaytotaltime;

    private Integer tuesdayattentiontime;

    private Integer wednesdaytotaltime;

    private Integer wednesdayattentiontime;

    private Integer thursdaytotaltime;

    private Integer thursdayattentiontime;

    private Integer fridaytotaltime;

    private Integer fridayattentiontime;

    private Integer saturdaytotaltime;

    private Integer saturdayattentiontime;

    private Integer sundaytotaltime;

    private Integer sundayattentiontime;

    private Date lastupdate;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getMondaytotaltime() {
        return mondaytotaltime;
    }

    public void setMondaytotaltime(Integer mondaytotaltime) {
        this.mondaytotaltime = mondaytotaltime;
    }

    public Integer getMondayattentiontime() {
        return mondayattentiontime;
    }

    public void setMondayattentiontime(Integer mondayattentiontime) {
        this.mondayattentiontime = mondayattentiontime;
    }

    public Integer getTuesdaytotaltime() {
        return tuesdaytotaltime;
    }

    public void setTuesdaytotaltime(Integer tuesdaytotaltime) {
        this.tuesdaytotaltime = tuesdaytotaltime;
    }

    public Integer getTuesdayattentiontime() {
        return tuesdayattentiontime;
    }

    public void setTuesdayattentiontime(Integer tuesdayattentiontime) {
        this.tuesdayattentiontime = tuesdayattentiontime;
    }

    public Integer getWednesdaytotaltime() {
        return wednesdaytotaltime;
    }

    public void setWednesdaytotaltime(Integer wednesdaytotaltime) {
        this.wednesdaytotaltime = wednesdaytotaltime;
    }

    public Integer getWednesdayattentiontime() {
        return wednesdayattentiontime;
    }

    public void setWednesdayattentiontime(Integer wednesdayattentiontime) {
        this.wednesdayattentiontime = wednesdayattentiontime;
    }

    public Integer getThursdaytotaltime() {
        return thursdaytotaltime;
    }

    public void setThursdaytotaltime(Integer thursdaytotaltime) {
        this.thursdaytotaltime = thursdaytotaltime;
    }

    public Integer getThursdayattentiontime() {
        return thursdayattentiontime;
    }

    public void setThursdayattentiontime(Integer thursdayattentiontime) {
        this.thursdayattentiontime = thursdayattentiontime;
    }

    public Integer getFridaytotaltime() {
        return fridaytotaltime;
    }

    public void setFridaytotaltime(Integer fridaytotaltime) {
        this.fridaytotaltime = fridaytotaltime;
    }

    public Integer getFridayattentiontime() {
        return fridayattentiontime;
    }

    public void setFridayattentiontime(Integer fridayattentiontime) {
        this.fridayattentiontime = fridayattentiontime;
    }

    public Integer getSaturdaytotaltime() {
        return saturdaytotaltime;
    }

    public void setSaturdaytotaltime(Integer saturdaytotaltime) {
        this.saturdaytotaltime = saturdaytotaltime;
    }

    public Integer getSaturdayattentiontime() {
        return saturdayattentiontime;
    }

    public void setSaturdayattentiontime(Integer saturdayattentiontime) {
        this.saturdayattentiontime = saturdayattentiontime;
    }

    public Integer getSundaytotaltime() {
        return sundaytotaltime;
    }

    public void setSundaytotaltime(Integer sundaytotaltime) {
        this.sundaytotaltime = sundaytotaltime;
    }

    public Integer getSundayattentiontime() {
        return sundayattentiontime;
    }

    public void setSundayattentiontime(Integer sundayattentiontime) {
        this.sundayattentiontime = sundayattentiontime;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }
}