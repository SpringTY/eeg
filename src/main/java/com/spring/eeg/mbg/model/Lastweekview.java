package com.spring.eeg.mbg.model;

public class Lastweekview {
    private Integer userid;

    private String username;

    private Long attention;

    private Long total;

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

    public Long getAttention() {
        return attention;
    }

    public void setAttention(Long attention) {
        this.attention = attention;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}