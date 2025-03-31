package org.leetcode.topInterview150.medium.spiralMatrix54;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void spiralOrder() {
        Solution s = new Solution();
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> result = s.spiralOrder(input);
        assertArrayEquals(new Integer[]{1, 2, 3, 6, 9, 8, 7, 4, 5}, result.toArray());
    }

    @Test
    public void spiralOrder2() {
        Solution s = new Solution();
        int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> result = s.spiralOrder(input);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7}, result.toArray());
    }

    @Test
    public void spiralOrder3() {
        Solution s = new Solution();
        int[][] input = {{1}};
        List<Integer> result = s.spiralOrder(input);
        assertArrayEquals(new Integer[]{1}, result.toArray());
    }

    @Test
    public void spiralOrder4() {
        Solution s = new Solution();
        int[][] input = {{3}, {2}};
        List<Integer> result = s.spiralOrder(input);
        assertArrayEquals(new Integer[]{3, 2}, result.toArray());
    }

    @Test
    public void spiralOrder5() {
        Solution s = new Solution();
        int[][] input = {{2, 5, 8}, {4, 0, -1}};
        List<Integer> result = s.spiralOrder(input);
        assertArrayEquals(new Integer[]{2, 5, 8, -1, 0, 4}, result.toArray());
    }
}