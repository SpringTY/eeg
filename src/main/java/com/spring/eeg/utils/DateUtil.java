package com.spring.eeg.utils;

import com.sun.org.apache.regexp.internal.RE;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;
import java.util.Date;

public class DateUtil {
    public static LocalDate getLastWeekSundayDate(LocalDate currentDate) {
        LocalDate targetDate = null;
        DayOfWeek targetDateOfWeek = null;
        // define the start of week is Monday
        for (int i = 1; ; i++) {
            targetDate = currentDate.minusDays(i);
            targetDateOfWeek = targetDate.getDayOfWeek();
            if (targetDateOfWeek.equals(DayOfWeek.SUNDAY)) {
                break;
            }
        }
        return targetDate;
    }

    public static LocalDate toLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDate toLocalDate(java.sql.Date date) {
        return date.toLocalDate();
    }

    public static java.sql.Date toSqlDate(LocalDate localDate) {
        return java.sql.Date.valueOf(localDate);
    }
    public static java.sql.Date toSqlDate(Date date){
        return new java.sql.Date(date.getTime());
    }
    public static Date toUtilDate(java.sql.Date date){
        return new Date(date.getTime());
    }
    public static Date toUtilDate(LocalDate date){
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = date.atStartOfDay().atZone(zone).toInstant();
        return Date.from(instant);
    }
}
