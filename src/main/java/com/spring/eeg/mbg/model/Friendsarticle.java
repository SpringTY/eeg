package com.spring.eeg.mbg.model;

public class Friendsarticle {
    private Integer userfrom;

    private String articlename;

    private String articlepath;

    private Integer userid;

    private String username;

    public Integer getUserfrom() {
        return userfrom;
    }

    public void setUserfrom(Integer userfrom) {
        this.userfrom = userfrom;
    }

    public String getArticlename() {
        return articlename;
    }

    public void setArticlename(String articlename) {
        this.articlename = articlename == null ? null : articlename.trim();
    }

    public String getArticlepath() {
        return articlepath;
    }

    public void setArticlepath(String articlepath) {
        this.articlepath = articlepath == null ? null : articlepath.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}