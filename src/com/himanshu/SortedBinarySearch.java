package com.himanshu;

import java.util.Arrays;

public class SortedBinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7, 9},
                {2, 8, 10, 12},
                {3, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(SortedSearch(arr, 16)));
    }
    static int[] BinarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (arr[row][mid] > target) {
                cStart = mid + 1;
            }
            if (arr[row][mid] < target) {
                cEnd = mid - 1;
            }
            if (arr[row][mid] == target) {
                return new int[]{row, mid};

            }
        }
        return new int[]{-1, -1};
    }

    static int[] SortedSearch(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;
        int rStart = 0;
        int rEnd = arr.length - 1;
        int cMid = cols / 2;
        if (rows == 1) {
            return BinarySearch(arr, 0, 0, cols - 1, target);
        }
        //while should run till rows reduced to 2
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (arr[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (arr[mid][cMid] > target) {
                rEnd = mid-1;
            }
            if (arr[mid][cMid] < target) {
                rStart = mid+1;
            }
        }
        //now here we Have 2 rows only
        //search in group cmid and remaining 2 row
        if (arr[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (arr[rStart + 1][cMid] == target) {
            return new int[]{rStart+1, cMid};
        }
        //search in 1 half
        if (target <= arr[rStart][cMid - 1]) {
            return BinarySearch(arr, rStart, 0, cMid - 1, target);
        }
        //search in 2 half
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols - 1]) {
            return BinarySearch(arr, rStart, cMid + 1, cols - 1, target);
        }
        //search in 3half
        if (target <= arr[rStart + 1][cMid - 1]) {
            return BinarySearch(arr, rStart + 1, 0, cMid - 1, target);
        }
        //search in 4 half
        if (target >= arr[rStart + 1][cMid + 1] && target <= arr[rStart + 1][cols - 1]) {
            return BinarySearch(arr, rStart + 1, cMid + 1, cols - 1, target);
        }
        return new int[]{-1, -1};
    }
}

