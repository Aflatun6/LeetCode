package org.leetcode.topInterview150.medium.hIndex274;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void hIndex() {
        Solution solution = new Solution();
        int hIndex = solution.hIndex(new int[]{3, 0, 6, 1, 5});
        assertEquals(hIndex, 3);
    }

    @Test
    public void hIndex2() {
        Solution solution = new Solution();
        int hIndex = solution.hIndex(new int[]{1, 3, 1});
        assertEquals(hIndex, 1);
    }

    @Test
    public void hIndex3() {
        Solution solution = new Solution();
        int hIndex = solution.hIndex(new int[]{11, 15});
        assertEquals(hIndex, 2);
    }

    @Test
    public void hIndex4() {
        Solution solution = new Solution();
        int hIndex = solution.hIndex(new int[]{4, 4, 0, 0});
        assertEquals(hIndex, 2);
    }

    @Test
    public void hIndex5() {
        Solution solution = new Solution();
        int hIndex = solution.hIndex(new int[]{1, 7, 9, 4});
        assertEquals(hIndex, 3);
    }

    @Test
    public void hIndex6() {
        Solution solution = new Solution();
        int hIndex = solution.hIndex(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
        assertEquals(hIndex, 5);
    }
}