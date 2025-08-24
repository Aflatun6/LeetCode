package org.leetcode.topInterview150.medium.rotateImage48;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void rotate() {
        int[][] result = new Solution().rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        assertArrayEquals(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}, result);
    }

    @Test
    public void rotate2() {
        int[][] result = new Solution().rotate(new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}});
        assertArrayEquals(new int[][]{{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}}, result);
    }

    @Test
    public void rotate3() {
        int[][] result = new Solution().rotate(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}});
        assertArrayEquals(new int[][]{{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}}, result);
    }
}