package com.spring.eeg.mbg.model;

import java.util.Date;

public class Eegfilelist {
    private Integer fileid;

    private Integer userid;

    private String filepath;

    private Date uploaddate;

    private Integer analysised;

    private Integer totaltime;

    private Integer attentiontime;

    private Integer planid;

    private String note;

    private String info;

    public Integer getFileid() {
        return fileid;
    }

    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public Date getUploaddate() {
        return uploaddate;
    }

    public void setUploaddate(Date uploaddate) {
        this.uploaddate = uploaddate;
    }

    public Integer getAnalysised() {
        return analysised;
    }

    public void setAnalysised(Integer analysised) {
        this.analysised = analysised;
    }

    public Integer getTotaltime() {
        return totaltime;
    }

    public void setTotaltime(Integer totaltime) {
        this.totaltime = totaltime;
    }

    public Integer getAttentiontime() {
        return attentiontime;
    }

    public void setAttentiontime(Integer attentiontime) {
        this.attentiontime = attentiontime;
    }

    public Integer getPlanid() {
        return planid;
    }

    public void setPlanid(Integer planid) {
        this.planid = planid;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}