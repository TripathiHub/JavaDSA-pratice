package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CWHtimezone {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        LocalDate dt= LocalDate.now();
        System.out.println(dt);
        LocalDateTime t=LocalDateTime.now();
        System.out.println(t);
        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-mm-yyyy");//E in this argument will give days of weeks and a will give am/pm
        String date= t.format(df);
        System.out.println(date);
    }
}
