package com.problemfighter.java.datetime;

import java.util.Calendar;
import java.util.Date;

public class CalenderUtil {

    private final Calendar calendar;

    public CalenderUtil() {
        this.calendar = Calendar.getInstance();
    }

    public CalenderUtil setDate(Date date) {
        calendar.setTime(date);
        return this;
    }

    public Calendar props() {
        return this.calendar;
    }

    private Date adjustDateTime(Integer adjustmentType, Integer adjustAmount) {
        calendar.add(adjustmentType, adjustAmount);
        return calendar.getTime();
    }

    public Date adjustMinute(Integer adjustAmount) {
        return adjustDateTime(Calendar.MINUTE, adjustAmount);
    }

    public Date adjustWithMonth(Integer adjustAmount) {
        return adjustDateTime(Calendar.MONTH, adjustAmount);
    }

    public Date adjustWithSecond(Integer adjustAmount) {
        return adjustDateTime(Calendar.SECOND, adjustAmount);
    }


    public Date adjustWithHour(Integer adjustAmount) {
        return adjustDateTime(Calendar.HOUR, adjustAmount);
    }

    public Date adjustWithDay(Integer adjustAmount) {
        return adjustDateTime(Calendar.DATE, adjustAmount);
    }

    public static CalenderUtil instance() {
        return new CalenderUtil();
    }
}
