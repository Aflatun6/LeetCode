package org.leetcode.topInterview150.medium.gameOfLife289;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void gameOfLife() {
        int[][] result = new Solution().gameOfLife(new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}});
        assertArrayEquals(new int[][]{{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}}, result);
    }

    @Test
    public void gameOfLife2() {
        int[][] result = new Solution().gameOfLife(new int[][]{{1, 1}, {1, 0}});
        assertArrayEquals(new int[][]{{1, 1}, {1, 1}}, result);
    }
}