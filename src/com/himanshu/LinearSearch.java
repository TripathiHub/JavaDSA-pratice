package com.himanshu;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 89, 84, 52};
        int[] arr2 = {123, 344, 565, 896, 847, 528};
        int[][] arr3 = {
                {123},
                {344, 22, 56},
                {565, 896, 847},
                {528, 49}
        };
        System.out.println(search(arr,52));
        System.out.println(search(arr2,565,0,3));
        int[] ans = search(arr3, 22);
        System.out.println(Arrays.toString(ans));
    }
        static int[] search(int[][] arrname2,int target){
        if(arrname2.length==0){
            return new int[] {-1,-1};
        }
            for (int i = 0; i <arrname2.length ; i++) {
                for (int j = 0; j <arrname2[i].length ; j++) {
                    if (arrname2[i][j]==target){
                        return new int[]{i,j};
                    }
                }
            }
            return new int[]{-1,-1};
        }
        static int search(int[] arrname,int target ,int start,int end){
            if(arrname.length<=0) {
                return -1;
            }
            for (int i = start; i <=end ; i++) {
                if(arrname[i]==target){
                    return i;
                }
            }
            return -1;
        }
        static int search(int[] arrname,int target) {
            if (arrname.length <= 0) {
                return -1;
            }
            for (int i = 0; i < arrname.length; i++) {
                if (arrname[i] == target) {
                    return i;
                }
            }
            return -1;
        }
}
