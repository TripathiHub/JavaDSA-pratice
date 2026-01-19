package com.himanshu;

import java.util.Arrays;

public class swaparray {
    public static void main(String[] args) {
        int[] arr = {12,23,234,56,34};
        int[] arr2 = {121,231,2341,516,341};
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));
        swap(2,3,arr2);
        swap(2,3,arr);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));
    }
  static void  swap(int ind1,int ind2,int[] arrname){
        int temp=0;
        temp = arrname[ind1];
        arrname[ind1]=arrname[ind2];
        arrname[ind2] = temp;
    }
}
