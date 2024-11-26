package org.leetcode.topInterview150.hard.minimumWindowSubstring76;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minWindow() {
        Solution solution = new Solution();
        String result = solution.minWindow("ADOBECODEBANC", "ABC");
        assertEquals("BANC", result);
    }

    @Test
    public void minWindow2() {
        Solution solution = new Solution();
        String result = solution.minWindow("a", "a");
        assertEquals("a", result);
    }

    @Test
    public void minWindow3() {
        Solution solution = new Solution();
        String result = solution.minWindow("a", "aa");
        assertEquals("", result);
    }

    @Test
    public void minWindow4() {
        Solution solution = new Solution();
        String result = solution.minWindow("a", "b");
        assertEquals("", result);
    }

    @Test
    public void minWindow5() {
        Solution solution = new Solution();
        String result = solution.minWindow("aa", "aa");
        assertEquals("aa", result);
    }

    @Test
    public void minWindow6() {
        Solution solution = new Solution();
        String result = solution.minWindow("acbbaca", "aba");
        assertEquals("baca", result);
    }

}