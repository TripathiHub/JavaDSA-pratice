package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CWHprariceset14q2 {
    public static void main(String[] args) {
        Date d= new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        Calendar c= Calendar.getInstance();
        System.out.println(Calendar.HOUR_OF_DAY+":"+Calendar.MINUTE+":"+Calendar.SECOND);
        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df= DateTimeFormatter.ofPattern("H:m:s");
        String date= dt.format(df);
        System.out.println(date);
    }
}
