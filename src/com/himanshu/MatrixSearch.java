package com.himanshu;

import java.util.Arrays;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] arr={
                {12,18,19},
                {22,28,28},
                {30,37,50}
        };
        System.out.println(Arrays.toString(MatrixSerch(arr,28)));
    }
    static int[] MatrixSerch(int[][] matrix,int target){
        int r=0;
        int c= matrix.length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target) {
                return new int[]{r, c};
            }if(matrix[r][c]>target){
                    c--;
                } else {
                    r++;
                }
            }

        return new int[]{-1,-1};
    }
}
