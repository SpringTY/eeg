package com.spring.eeg.mbg.model;

import lombok.Data;

import java.util.Date;
@Data
public class Eegfilelist {
    private Integer fileid;

    private Integer userid;

    private String filepath;

    private Date uploaddate;

    private Integer analysised;

}