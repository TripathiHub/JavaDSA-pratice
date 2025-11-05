package com.company;

public class CWHpraticeset14q1 {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
            System.out.println("no Exception");
        }catch(ArithmeticException e){
            System.out.println("haha");
        }catch (IllegalArgumentException e){
            System.out.println("hehe");
        }
    }
}
