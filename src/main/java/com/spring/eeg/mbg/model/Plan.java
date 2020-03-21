package com.spring.eeg.mbg.model;

import java.util.Date;

public class Plan {
    private Integer planid;

    private Integer userid;

    private String planname;

    private String plandescription;

    private Integer plantime;

    private Integer realtime;

    private String planinfo;

    private Date plandate;

    private String finished;

    private String trash;

    private String important;

    public Integer getPlanid() {
        return planid;
    }

    public void setPlanid(Integer planid) {
        this.planid = planid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPlanname() {
        return planname;
    }

    public void setPlanname(String planname) {
        this.planname = planname == null ? null : planname.trim();
    }

    public String getPlandescription() {
        return plandescription;
    }

    public void setPlandescription(String plandescription) {
        this.plandescription = plandescription == null ? null : plandescription.trim();
    }

    public Integer getPlantime() {
        return plantime;
    }

    public void setPlantime(Integer plantime) {
        this.plantime = plantime;
    }

    public Integer getRealtime() {
        return realtime;
    }

    public void setRealtime(Integer realtime) {
        this.realtime = realtime;
    }

    public String getPlaninfo() {
        return planinfo;
    }

    public void setPlaninfo(String planinfo) {
        this.planinfo = planinfo == null ? null : planinfo.trim();
    }

    public Date getPlandate() {
        return plandate;
    }

    public void setPlandate(Date plandate) {
        this.plandate = plandate;
    }

    public String getFinished() {
        return finished;
    }

    public void setFinished(String finished) {
        this.finished = finished == null ? null : finished.trim();
    }

    public String getTrash() {
        return trash;
    }

    public void setTrash(String trash) {
        this.trash = trash == null ? null : trash.trim();
    }

    public String getImportant() {
        return important;
    }

    public void setImportant(String important) {
        this.important = important == null ? null : important.trim();
    }
}