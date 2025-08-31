package org.leetcode.topInterview150.easy.twoSum1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void twoSum() {
        int[] result = new Solution().twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void twoSum2() {
        int[] result = new Solution().twoSum(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void twoSum3() {
        int[] result = new Solution().twoSum(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void twoSum4() {
        int[] result = new Solution().twoSum(new int[]{3, 2, 3}, 6);
        assertArrayEquals(new int[]{0, 2}, result);
    }
}