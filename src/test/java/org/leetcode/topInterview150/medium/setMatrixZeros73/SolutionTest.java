package org.leetcode.topInterview150.medium.setMatrixZeros73;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void setZeroes() {
        int[][] result = new Solution().setZeroes(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}});
        assertArrayEquals(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}, result);
    }

    @Test
    public void setZeroes2() {
        int[][] result = new Solution().setZeroes(new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}});
        assertArrayEquals(new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}}, result);
    }
}