package com.himanshu;

import java.util.Scanner;

public class kunalcasecheck
{
    public static void main(String[] args) {
        System.out.println(" enter a charcter for case check");
        Scanner sc = new Scanner (System.in);
        char ch = sc.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("lower case");
        }
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("upper case");
        }
    }
}
