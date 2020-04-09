package com.spring.eeg.mbg.model;

public class Publicarticle {
    private String articlename;

    private String articlepath;

    private String username;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}