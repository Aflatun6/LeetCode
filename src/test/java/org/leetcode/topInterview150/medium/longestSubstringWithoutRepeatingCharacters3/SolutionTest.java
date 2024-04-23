package org.leetcode.topInterview150.medium.longestSubstringWithoutRepeatingCharacters3;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, result);
    }

    @Test
    public void lengthOfLongestSubstring2() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("bbbbb");
        assertEquals(1, result);
    }

    @Test
    public void lengthOfLongestSubstring3() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, result);
    }

    @Test
    public void lengthOfLongestSubstring4() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("dvdf");
        assertEquals(3, result);
    }

    @Test
    public void lengthOfLongestSubstring5() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring(" ");
        assertEquals(1, result);
    }
}