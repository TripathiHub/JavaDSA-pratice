package com.himanshu;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
 int[] arr={0,-5,1,-2,10};
    insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void insertion(int[] arr){
        for (int i =0; i <arr.length-1 ; i++) {
            for (int j =i+1; j>0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static int maxIndex(int[] arr,int start,int end){
        int maxIndex = start;
        for (int i=start; i <end ; i++) {
            if(arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    static void swap(int[] arr,int ind1,int ind2){
        int temp=arr[ind1];
         arr[ind1]=arr[ind2];
         arr[ind2]=temp;

    }
   static void selectionSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            int lastIndex=arr.length-1-i;
            int maxIndex= maxIndex(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }
}
