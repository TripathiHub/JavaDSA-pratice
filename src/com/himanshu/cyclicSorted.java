package com.himanshu;

import java.util.Arrays;

public class cyclicSorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        sortingDsc(arr);
      //  sortingAsc(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortingDsc(int[] arr){
        boolean swap=false;
        for (int i = 0; i <arr.length ; i++) {
            for (int j=1; j<arr.length-i ; j++) {
                if(arr[j]>arr[j-1]){
                    //then swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    static void sortingAsc(int[] arr){
        boolean swap=false;
        for (int i = 0; i <arr.length ; i++) {
            for (int j=1; j<arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    //then swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
}
