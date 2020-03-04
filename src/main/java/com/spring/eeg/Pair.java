package com.spring.eeg;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Data
@Repository
public class Pair {
    Integer unAttentionTime;
    Integer attentionTime;

    public static Pair getPair(int tTime, int aTime) {
        Pair pair = new Pair();
        pair.setUnAttentionTime(tTime);
        pair.setAttentionTime(aTime);
        return pair;
    }
}
