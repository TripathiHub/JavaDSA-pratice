package com.himanshu;

public class BinarySerchUnknown {
    public static void main(String[] args) {
        int[] arr = {99,88,77,66,55,44,33,22,11,0};
        int[] arr2 = {8,9,12,19,34,67,83,92,99};
        int rel= BinarySerch(arr,99);
        int rel2= BinarySerch(arr2,34);
        System.out.println(rel);
        System.out.println(rel2);
    }
    static int BinarySerch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid= start + (end-start)/2;
            if(isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                }
                if (arr[mid] == target) {
                    return mid;
                } else {
                    start = mid + 1;
                }
            }else{
                if (arr[mid] > target) {
                    start=mid+1;
                }
                if (arr[mid] == target) {
                    return mid;
                } else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
