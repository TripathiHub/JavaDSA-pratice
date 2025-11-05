package com.company;

import java.util.Scanner;

class customException extends Exception{
    public String toString(){
        return "max numbers of attemps exceeds";
    }
}
public class CWHpraticeset14q2 {
    public static void arrayindex() throws customException {
        int[] marks = new int[3];
        marks[0] = 90;
        marks[1] = 80;
        marks[2] = 70;
        int index;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i < 5) {
            System.out.println("enter array index");
            index = sc.nextInt();
            try {
                System.out.println("the marks at that index is : " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("invalid array index");
                i++;
            }

        }
        if (i >= 5) {
            System.out.println("error");
            throw new customException();
        }
    }

    public static void main(String[] args) {
        try {
            arrayindex();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
