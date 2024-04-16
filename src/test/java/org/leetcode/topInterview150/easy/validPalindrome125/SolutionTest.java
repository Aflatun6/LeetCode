package org.leetcode.topInterview150.easy.validPalindrome125;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome("A man, a plan, a canal: Panama");
        assertTrue(result);
    }

    @Test
    public void isPalindrome2() {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome("race a car");
        assertFalse(result);
    }

    @Test
    public void isPalindrome3() {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(" ");
        assertTrue(result);
    }
}