package org.leetcode.topInterview150.medium.gasStation134;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void canCompleteCircuit() {
        Solution solution = new Solution();
        int i = solution.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2});
        assertEquals(i, 3);
    }

    @Test
    public void canCompleteCircuit2() {
        Solution solution = new Solution();
        int i = solution.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3});
        assertEquals(i, -1);
    }

    @Test
    public void canCompleteCircuit3() {
        Solution solution = new Solution();
        int i = solution.canCompleteCircuit(new int[]{5, 1, 2, 3, 4}, new int[]{4, 4, 1, 5, 1});
        assertEquals(i, 4);
    }

    @Test
    public void canCompleteCircuit4() {
        Solution solution = new Solution();
        int i = solution.canCompleteCircuit(new int[]{3, 3, 4}, new int[]{3, 4, 4});
        assertEquals(i, -1);
    }

    @Test
    public void canCompleteCircuit5() {
        Solution solution = new Solution();
        int i = solution.canCompleteCircuit(new int[]{7, 1, 0, 11, 4}, new int[]{5, 9, 1, 2, 5});
        assertEquals(i, 3);
    }
}