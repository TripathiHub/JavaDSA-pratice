package com.himanshu;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean rel= isArmstrong(n);
        System.out.println(rel);
        for(int i=0;i<999;i++){
            if(isArmstrong(i)==true){
                System.out.println(i);
            }
        }
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum=0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum==original;
    }
}
