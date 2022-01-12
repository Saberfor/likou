package com.gxc.likou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 合并区间
 */
public class MergeInterval {

    public static void main(String[] args) {
        int[][] intervals = new int[4][2];
        intervals[1] = new int[]{0,2};
        intervals[3] = new int[]{1,4};
        intervals[2] = new int[]{3,5};
        intervals[0] = new int[]{15,18};
       /* Arrays.stream(intervals).forEach(a ->{
            System.out.println(a[0] + "," + a[1]);
        });*/
        Arrays.stream(merge(intervals)).forEach(a ->{
            System.out.println(a[0] + "," + a[1]);
        });

    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> re = new ArrayList<>();
        int[] compare = intervals[0];
        for (int i=1;i<intervals.length;i++){
            if (compare[1]>=intervals[i][0]) {
                compare[1]=Math.max(compare[1],intervals[i][1]);
            } else {
                re.add(compare);
                compare=intervals[i];
            }

        }
        re.add(compare);
        return re.toArray(new int[re.size()][2]);
    }

}
