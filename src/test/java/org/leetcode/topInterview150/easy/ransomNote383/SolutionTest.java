package org.leetcode.topInterview150.easy.ransomNote383;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void canConstruct() {
        Solution solution = new Solution();
        boolean result = solution.canConstruct("a", "b");
        assertFalse(result);
    }

    @Test
    public void canConstruct2() {
        Solution solution = new Solution();
        boolean result = solution.canConstruct("aa", "ab");
        assertFalse(result);
    }

    @Test
    public void canConstruct3() {
        Solution solution = new Solution();
        boolean result = solution.canConstruct("aa", "aab");
        assertTrue(result);
    }
}