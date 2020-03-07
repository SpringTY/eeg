package com.spring.eeg.Model;

import lombok.Data;
import org.springframework.stereotype.Repository;
@Data
@Repository
public class EEGTime {
    Integer totalTime;
    Integer attentionTime;

    public EEGTime() {
    }

    public EEGTime(Integer totalTime, Integer attentionTime) {
        this.totalTime = totalTime;
        this.attentionTime = attentionTime;
    }
}
