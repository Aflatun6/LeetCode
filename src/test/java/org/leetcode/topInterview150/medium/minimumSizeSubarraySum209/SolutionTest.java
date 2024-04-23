package org.leetcode.topInterview150.medium.minimumSizeSubarraySum209;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minSubArrayLen() {
        int result = new Solution().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        assertEquals(2, result);
    }

    @Test
    public void minSubArrayLen2() {
        int result = new Solution().minSubArrayLen(4, new int[]{1, 4, 4});
        assertEquals(1, result);
    }

    @Test
    public void minSubArrayLen3() {
        int result = new Solution().minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1});
        assertEquals(0, result);
    }

    @Test
    public void minSubArrayLen4() {
        int result = new Solution().minSubArrayLen(7, new int[]{1, 1, 1, 1, 7});
        assertEquals(1, result);
    }
}