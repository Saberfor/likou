package com.gxc.likou;

import java.util.*;

/**
 * 对角线遍历
 */
public class findDiagonalOrder {

    public static void main(String[] args) {
        int[][] intervals = new int[3][3];
        intervals[0] = new int[]{1,2,3};
        intervals[1] = new int[]{4,5,6};
        intervals[2] = new int[]{7,8,9};
        Arrays.stream(intervals).forEach(a ->{
            System.out.println(a[0] + "," + a[1]+ "," + a[2]);
        });
        Arrays.stream(findDiagonalOrder(intervals)).forEach(a ->{
            System.out.println(a + ",");
        });
    }

    public static int[] findDiagonalOrder(int[][] matrix) {
        int[] result = new int[matrix.length*matrix[0].length];
        int i=0,j = 0;
        int sum = 0;
        boolean order = true;
        while (sum<matrix.length*matrix[0].length) {
            result[sum] = matrix[i][j];
            if (order) {
                i--;
                j++;
            } else {
                i++;
                j--;
            }

            if (i<0 || j<0 || i==matrix.length || j==matrix[0].length) {
                if (order) order = false;
                else order = true;
            }
            if (i==matrix.length) {
                i--;
                j++;j++;
            }
            if (j==matrix[0].length) {
                i++;
                i++;
                j--;
            }
            if (i<0) {
                i++;
            }
            if (j<0) {
                j++;
            }
            sum++;
        }
        return result;
    }


}
