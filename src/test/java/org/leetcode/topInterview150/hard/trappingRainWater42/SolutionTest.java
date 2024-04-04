package org.leetcode.topInterview150.hard.trappingRainWater42;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void trap() {
        Solution solution = new Solution();
        int trap = solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        assertEquals(trap, 6);
    }

    @Test
    public void trap2() {
        Solution solution = new Solution();
        int trap = solution.trap(new int[]{4, 2, 0, 3, 2, 5});
        assertEquals(trap, 9);
    }

    @Test
    public void trap3() {
        Solution solution = new Solution();
        int trap = solution.trap(new int[]{4, 2, 3});
        assertEquals(trap, 1);
    }
}