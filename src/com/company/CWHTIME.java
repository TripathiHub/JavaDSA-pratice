package com.company;

public class CWHTIME
{
    public static void main(String[] args) {
        System.out.print(System.currentTimeMillis()/1000/3600/24/365);
        System.out.print(" years ");
        System.out.print(System.currentTimeMillis()/1000/3600/24/365/12);
        System.out.print(" months ");
        System.out.print(System.currentTimeMillis()/1000/3600/24/365/12/30);
        System.out.print(" days ");
    }
}
