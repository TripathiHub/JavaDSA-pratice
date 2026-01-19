package com.himanshu;

import java.util.Scanner;

public class kunalqueans
{
    public static void main(String[] args)
    {
        System.out.println(" enter three numbers for comparison ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
     /*  if(a>b && a>c){
               System.out.println("largest number is "+ a);
        }
       if(b>a && b>c){
            System.out.println("the largest number is "+b);
      }
        else{
            System.out.println("the largest number is "+c);
        }
      */
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
        //System.out.println(Math.max(34,56));
    }
}
