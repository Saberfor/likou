package com.gxc.likou;

import java.util.Arrays;

/**
 * 90段翻转
 */
public class flip {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0] = new int[]{1,2,3};
        matrix[1] = new int[]{4,5,6};
        matrix[2] = new int[]{7,8,9};

        Arrays.stream(matrix).forEach(a ->{
            System.out.println(a[0] + "," + a[1] + "," + a[2]);
        });

        rotate(matrix);
        Arrays.stream(matrix).forEach(a ->{
            System.out.println(a[0] + "," + a[1] + "," + a[2]);
        });
    }

    public static void rotate(int[][] matrix) {
        int temp = 0;
        int length = matrix.length;
        //上下翻转，行只需循环一般
        for (int i=0;i<matrix.length/2;i++) {
            for (int j=0;j<matrix[i].length;j++) {
                temp = matrix[length-i-1][j];
                matrix[length-i-1][j] = matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        //对角翻转
        for (int i=0;i<matrix.length;i++) {
            //已翻转过滤
            for (int j=0;j<i;j++) {
                temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j]=temp;
            }
        }
    }
}
