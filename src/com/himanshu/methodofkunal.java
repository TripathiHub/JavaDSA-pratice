package com.himanshu;

public class methodofkunal {
    public static void main(String[] args) {
        int a=42;
        int b=77;
         swap(a,b);
        System.out.println(a+" "+b);
    }
    static void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
        // this a and b swapping is only for swap method its scope is not for main so we have print it here only
      //  System.out.println(a +" " +b);
    }
}

