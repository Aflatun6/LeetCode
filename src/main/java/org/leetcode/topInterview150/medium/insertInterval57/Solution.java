package org.leetcode.topInterview150.medium.insertInterval57;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        int[][] result = new Solution().insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5});
//        int[][] result = new Solution().insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8});
        System.out.println(Arrays.deepToString(result));
    }

    private static class Position {
        int index;
        boolean in;

        public Position(int index, boolean in) {
            this.index = index;
            this.in = in;
        }
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int newLEFT = newInterval[0];
        int newRIGHT = newInterval[1];

        Position[] positions = new Position[2];

        for (int i = 0; i < intervals.length - 1; i++) {
            int LEFT = intervals[i][0];
            int RIGHT = intervals[i][1];

            int nextLEFT = intervals[i + 1][0];
            int nextRIGHT = intervals[i + 1][1];

            if (newLEFT >= LEFT) {
                if (newLEFT <= RIGHT) {
                    positions[0] = new Position(i, true);
                } else {
                    positions[0] = new Position(i + 1, false);
                }
            }

            if (newRIGHT <= RIGHT) {
                if (newRIGHT >= LEFT) {
                    positions[1] = new Position(i, true);
                } else {
                    positions[1] = new Position(i - 1, false);
                }
            } else {
                if (newRIGHT >= nextLEFT) {
                    positions[1] = new Position(i + 1, true);
                } else {
                    positions[1] = new Position(i + 1, false);
                }
            }
        }

        System.out.println(Arrays.toString(positions));
        return merge(positions, intervals, newInterval);
    }

    private int[][] merge(Position[] positions, int[][] intervals, int[] newInterval) {
        List<int[]> mergedIntervals = new ArrayList<>();
        Position LEFT = positions[0];
        Position RIGHT = positions[1];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= (LEFT.in ? LEFT.index - 1 : LEFT.index); i++) {
            mergedIntervals.add(intervals[i]);
        }

        for (int i = (LEFT.in ? LEFT.index : LEFT.index + 1);
             i <= (RIGHT.in ? RIGHT.index : RIGHT.index - 1);
             i++) {
            min = Math.min(newInterval[0], intervals[i][0]);
            max = Math.max(newInterval[1], intervals[i][1]);
        }
        mergedIntervals.add(new int[]{min, max});

        for (int i = RIGHT.index + 1; i < intervals.length; i++) {
            mergedIntervals.add(intervals[i]);
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}