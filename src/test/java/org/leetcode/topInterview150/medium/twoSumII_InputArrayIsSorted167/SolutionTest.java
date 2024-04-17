package org.leetcode.topInterview150.medium.twoSumII_InputArrayIsSorted167;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void twoSum() {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void twoSum2() {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{2, 3, 4}, 6);
        assertArrayEquals(new int[]{1, 3}, result);
    }

    @Test
    public void twoSum3() {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{-1, 0}, -1);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void twoSum4() {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{5, 25, 75}, 100);
        assertArrayEquals(new int[]{2, 3}, result);
    }
}