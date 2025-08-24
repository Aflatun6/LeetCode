package org.leetcode.topInterview150.medium.mergeIntervals56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {

    public static void main(String[] args) {
//        int[][] merge = new Solution().merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
//        int[][] merge = new Solution().merge(new int[][]{{1, 4}, {0, 2}, {3, 5}});
        int[][] merge = new Solution().merge(new int[][]{{1, 4}, {2, 3}});
        System.out.println(Arrays.deepToString(merge));
    }

    public int[][] merge(int[][] intervals) {
        final int LEFT = 0;
        final int RIGHT = 1;
        ArrayList<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[RIGHT] - o2[RIGHT];
            }
        });

        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals.length - 1; j >= i; j--) {
                int max = Math.max(intervals[i][RIGHT], intervals[j][RIGHT]);
                int min = Integer.MAX_VALUE;

                if ((intervals[i][RIGHT] >= intervals[j][LEFT] && intervals[i][LEFT] <= intervals[j][LEFT])
                        ||
                        (intervals[j][LEFT] >= intervals[i][LEFT] && intervals[j][LEFT] <= intervals[i][RIGHT])) {
                    min = Math.min(min, intervals[i][RIGHT]);
                }
                if (i == j) {
                    result.add(new int[]{intervals[i][LEFT], max});
                }
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}