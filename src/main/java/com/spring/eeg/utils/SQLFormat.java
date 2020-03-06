package com.spring.eeg.utils;

import java.sql.Date;

public class SQLFormat {
    public static Date toSqlDate(java.util.Date date) {
        return new Date(date.getTime());
    }

    public static java.util.Date toUtilDate(Date date) {
        return new java.util.Date(date.getTime());
    }
}
