package com.himanshu;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean rel = isprime(n);
        System.out.println(rel);
    }
    static boolean isprime(int n){
        int c=2;
        if(n<=1){
            return  false;
        }
        while(c*c<=n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
