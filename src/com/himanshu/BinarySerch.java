package com.himanshu;

public class BinarySerch {
    public static void main(String[] args) {
        int[] arr= {1,6,14,29,56,79,88,99};
        int rel =BinarySerch(arr,123);
        System.out.println(rel);
    }
    static int BinarySerch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid= start + (end-start)/2 ;
                if(arr[mid]>target){
                    end=mid-1;
                }
                if(arr[mid]==target){
                    return mid;
                }
                else {
                    start = mid+1;
                }
        }
        return -1;
    }
}
