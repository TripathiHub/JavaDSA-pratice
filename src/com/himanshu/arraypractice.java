package com.himanshu;

import java.util.Arrays;
import java.util.Scanner;

public class arraypractice {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }


      //  for(int a : arr){
          //  System.out.print(a);
     //   }
      //  System.out.println(Arrays.toString(arr));
    }
}
