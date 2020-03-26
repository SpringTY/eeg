package com.spring.eeg.Model;

import lombok.Data;

@Data
public class EEGData {
    Double timeStampMs;
    Integer poorSignal;
    Integer eegRawValue;
    Double eegRawVolt;
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
    String origin;
}
