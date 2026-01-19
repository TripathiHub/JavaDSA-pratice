package com.himanshu;

import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        System.out.println("enter Nth term of fibonacci series");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p =0;
        int c= 1;
        for(int i=2; i<n;i++){
            int temp = c;
            c = c+p;
            p = temp;
        }
        if(n==1){
            System.out.println(p);
            return;
        }
        if(n==2){
            System.out.println(c);
            return;
        }
        System.out.println(c);
    }
}
