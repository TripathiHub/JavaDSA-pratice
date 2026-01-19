package com.himanshu;

import java.util.Arrays;

public class reservearray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arrname){
        for (int i = 0; i <arrname.length/2 ; i++) {
             int temp = arrname[i];
            arrname[i] = arrname[arrname.length-1-i];
            arrname[arrname.length-1-i] = temp;
        }
    }
}
