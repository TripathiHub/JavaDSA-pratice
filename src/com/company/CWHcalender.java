package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CWHcalender {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(Calendar.DATE);
        System.out.println(Calendar.HOUR_OF_DAY);
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        System.out.println(gc.isLeapYear(2001));
        System.out.println(gc.getTime());
        System.out.println(c.getTime());
    }
}
