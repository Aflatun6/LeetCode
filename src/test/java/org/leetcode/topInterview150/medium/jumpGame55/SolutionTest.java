package org.leetcode.topInterview150.medium.jumpGame55;

import static org.junit.Assert.*;

public class SolutionTest {

    @org.junit.Test
    public void canJumpTrue() {
        Solution solution = new Solution();
        int[] nums = {2, 3, 1, 1, 4};
        assertTrue(solution.canJump(nums));
    }

    @org.junit.Test
    public void canJumpFalse() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 1, 0, 4};
        assertFalse(solution.canJump(nums));
    }
}