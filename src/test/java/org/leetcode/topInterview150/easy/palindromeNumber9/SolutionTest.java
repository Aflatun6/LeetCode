package org.leetcode.topInterview150.easy.palindromeNumber9;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        assertTrue(new Solution().isPalindrome(121));
    }

    @Test
    public void isPalindrome2() {
        assertFalse(new Solution().isPalindrome(-121));
    }

    @Test
    public void isPalindrome3() {
        assertFalse(new Solution().isPalindrome(10));
    }

    @Test
    public void isPalindrome4() {
        assertFalse(new Solution().isPalindrome(2147483647));
    }
}