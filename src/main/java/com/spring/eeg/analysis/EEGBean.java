package com.spring.eeg.analysis;

import lombok.Data;

@Data
public class EEGBean {
    String timestampMs;
    String poorSignal;
    Integer eegRawValue;
    Double eegRawValueVolts;
    Integer attention;
    Integer meditation;
    Integer blinkStrength;
    Integer delta;
    Integer theta;
    Integer alphaLow;
    Integer alphaHigh;
    Integer betaLow;
    Integer betaHigh;
    Integer gammaLow;
    Integer gammaMid;
    String tagEvent;
}
