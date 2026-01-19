package com.himanshu;

public class LeetcodeEvenDigits {
    public static void main(String[] args) {
        int[] arr= {23,40
                ,590,32,7};
       int ans= EvenDigits(arr);
        System.out.println(ans);
    }
    static int EvenDigits(int[] arr){
        int evencount=0;
        for (int i = 0; i <arr.length ; i++) {
            int sample =arr[i];
            int count=0;
            while(sample!=0){
                 sample=sample/10;
                 count++;
            }
            if(count%2==0){
                evencount++;
            }
        }

        return evencount;
    }
}
