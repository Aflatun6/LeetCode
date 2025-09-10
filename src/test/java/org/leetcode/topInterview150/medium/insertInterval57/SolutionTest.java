package org.leetcode.topInterview150.medium.insertInterval57;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void insert() {
        int[][] result = new Solution().insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5});
        int[][] expected = new int[][]{{1, 5}, {6, 9}};
        assertArrayEquals(expected, result);
    }

    @Test
    public void insert2() {
        int[][] result = new Solution().insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8});
        int[][] expected = new int[][]{{1, 2}, {3, 10}, {12, 16}};
        assertArrayEquals(expected, result);
    }
}