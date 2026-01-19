package com.himanshu;

import java.util.Arrays;

public class LeetcodeMaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {123,23,45},
                {23,68,5},
                {23,56,72,34}
        };
        int[] result = MaxWealthAndIndex(arr); // answer you will in the form {Maximum wealth,person number}
        System.out.println(Arrays.toString(result));
    }
    static int[] MaxWealthAndIndex(int[][] arr){
        int Maxwealth=0;
        int Maxindex=0;
        for (int i = 0; i <arr.length ; i++) {
            int[] sample = arr[i];
            int sum=0;
            for (int j = 0; j <arr[i].length ; j++) {
                sum = sum + sample[j];
                }
            if(sum>Maxwealth){
                Maxwealth=sum;
                Maxindex=i;
            }


        }
        return new int[]{Maxwealth,Maxindex} ;
    }
}
