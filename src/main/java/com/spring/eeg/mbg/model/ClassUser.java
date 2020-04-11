package com.spring.eeg.mbg.model;

public class ClassUser extends ClassUserKey {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}