package org.leetcode.topInterview150.medium.productOfArrayExceptSelf238;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void productExceptSelf() {
        Solution solution = new Solution();
        int[] ints = solution.productExceptSelf(new int[]{1, 2, 3, 4});
        assertArrayEquals(ints, new int[]{24, 12, 8, 6});
    }


    @Test
    public void productExceptSelf2() {
        Solution solution = new Solution();
        int[] ints = solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3});
        assertArrayEquals(ints, new int[]{0, 0, 9, 0, 0});
    }

    @Test
    public void productExceptSelf3() {
        Solution solution = new Solution();
        int[] ints = solution.productExceptSelf(new int[]{0, 0});
        assertArrayEquals(ints, new int[]{0, 0});
    }

    @Test
    public void productExceptSelf4() {
        Solution solution = new Solution();
        int[] ints = solution.productExceptSelf(new int[]{1, -1});
        assertArrayEquals(ints, new int[]{-1, 1});
    }
}