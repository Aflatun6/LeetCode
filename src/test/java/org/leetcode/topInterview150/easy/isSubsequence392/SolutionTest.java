package org.leetcode.topInterview150.easy.isSubsequence392;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isSubsequence() {
        Solution solution = new Solution();
        boolean result = solution.isSubsequence("abc", "ahbgdc");
        assertTrue(result);
    }

    @Test
    public void isSubsequence2() {
        Solution solution = new Solution();
        boolean result = solution.isSubsequence("axc", "ahbgdc");
        assertFalse(result);
    }

    @Test
    public void isSubsequence3() {
        Solution solution = new Solution();
        boolean result = solution.isSubsequence("", "ahbgdc");
        assertTrue(result);
    }
}