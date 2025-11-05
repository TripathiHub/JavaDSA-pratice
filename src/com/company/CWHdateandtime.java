package com.company;

import java.util.Date;

public class CWHdateandtime {
    public static void main(String[] args) {
       // System.out.println(Long.MAX_VALUE);
    //    System.out.println(System.currentTimeMillis());
        Date d1= new Date();
        System.out.println(d1);
        System.out.print(" time in millisecond ");
        System.out.print(d1.getTime());
        System.out.print(" date ");
        System.out.print(d1.getDate());
        System.out.print(" year ");
       // System.out.println(d1.getSeconds());
        System.out.print(d1.getYear());

    }
}
