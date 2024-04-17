package org.leetcode.topInterview150.medium.containerWithMostWater11;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxArea() {
        Solution solution = new Solution();
        int result = solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        assertEquals(49, result);
    }

    @Test
    public void maxArea2() {
        Solution solution = new Solution();
        int result = solution.maxArea(new int[]{1, 1});
        assertEquals(1, result);
    }
}