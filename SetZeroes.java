package com.gxc.likou;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 零矩阵
 */
public class SetZeroes {

    public static void main(String[] args) {
        int[][] intervals = new int[5][4];
        intervals[0] = new int[]{0,0,0,5};
        intervals[1] = new int[]{4,3,1,4};
        intervals[2] = new int[]{0,1,1,4};
        intervals[3] = new int[]{1,2,1,3};
        intervals[4] = new int[]{0,0,1,1};
        Arrays.stream(intervals).forEach(a ->{
            System.out.println(a[0] + "," + a[1]+ "," + a[2]+ "," + a[3]);
        });
        setZeroes(intervals);
        Arrays.stream(intervals).forEach(a ->{
            System.out.println(a[0] + "," + a[1]+ "," + a[2]+ "," + a[3]);
        });
    }

    public static void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[i].length;j++) {
                if (matrix[i][j]==0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[i].length;j++) {
                if (row.contains(i) || col.contains(j)) {
                    matrix[i][j]=0;
                }
            }
        }
    }
}
