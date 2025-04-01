package org.leetcode.topInterview150.easy.wordPattern290;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void wordPattern() {
        Solution solution = new Solution();
        boolean result = solution.wordPattern("abba", "dog cat cat dog");
        assertTrue(result);
    }

    @Test
    public void wordPattern2() {
        Solution solution = new Solution();
        boolean result = solution.wordPattern("abba", "dog cat cat fish");
        assertFalse(result);
    }

    @Test
    public void wordPattern3() {
        Solution solution = new Solution();
        boolean result = solution.wordPattern("aaaa", "dog cat cat dog");
        assertFalse(result);
    }

    @Test
    public void wordPattern4() {
        Solution solution = new Solution();
        boolean result = solution.wordPattern("abba", "dog dog dog dog");
        assertFalse(result);
    }

    @Test
    public void wordPattern5() {
        Solution solution = new Solution();
        boolean result = solution.wordPattern("abc", "dog cat dog");
        assertFalse(result);
    }
}