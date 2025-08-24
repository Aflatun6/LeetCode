package org.leetcode.topInterview150.medium.mergeIntervals56;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void merge() {
        Solution solution = new Solution();
        int[][] result = solution.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        assertArrayEquals(result, new int[][]{{1, 6}, {8, 10}, {15, 18}});
    }

    @Test
    public void merge2() {
        Solution solution = new Solution();
        int[][] result = solution.merge(new int[][]{{1, 4}, {4, 5}});
        assertArrayEquals(result, new int[][]{{1, 5}});
    }

    @Test
    public void merge3() {
        Solution solution = new Solution();
        int[][] result = solution.merge(new int[][]{{1, 4}, {0, 4}});
        assertArrayEquals(result, new int[][]{{0, 4}});
    }

    @Test
    public void merge4() {
        Solution solution = new Solution();
        int[][] result = solution.merge(new int[][]{{1, 4}, {2, 3}});
        assertArrayEquals(result, new int[][]{{1, 4}});
    }

    @Test
    public void merge5() {
        Solution solution = new Solution();
        int[][] result = solution.merge(new int[][]{{1, 4}, {0, 2}, {3, 5}});
        assertArrayEquals(result, new int[][]{{0, 5}});
    }
}