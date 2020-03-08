package com.spring.eeg.Model;

import lombok.Data;
import org.springframework.stereotype.Repository;
@Data
@Repository
public class EEGTime {
    Integer totalTime;
    Integer attentionTime;
    Integer unAttentionTime;
    public EEGTime() {
    }

    public EEGTime(Integer totalTime, Integer attentionTime, Integer unAttentionTime) {
        this.totalTime = totalTime;
        this.attentionTime = attentionTime;
        this.unAttentionTime = unAttentionTime;
    }
}
