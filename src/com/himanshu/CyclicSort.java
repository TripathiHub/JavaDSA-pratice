package com.himanshu;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
 int[] arr={4,1,5,2,3};
   CylicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
    static void CylicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int realind=arr[i]-1;
            if (arr[i] == arr[realind]) {
                i++;
            }else{
                swap(arr,i,realind);
            }
        }
    }
}
