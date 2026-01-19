package com.himanshu;

public class reversenumber {
    public static void main(String[] args)
    {
        int ans=0;
        int n= 123456789;
        while(n>0){
            int rem=n%10;
         ans=ans*10+rem;
         n=n/10;
        }
        System.out.println(ans);
    }
}
