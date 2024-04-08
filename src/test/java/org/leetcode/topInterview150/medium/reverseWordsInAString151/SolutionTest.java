package org.leetcode.topInterview150.medium.reverseWordsInAString151;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverseWords() {
        Solution solution = new Solution();
        String s = solution.reverseWords("the sky is blue");
        assertEquals(s, "blue is sky the");
    }

    @Test
    public void reverseWords2() {
        Solution solution = new Solution();
        String s = solution.reverseWords("  hello world  ");
        assertEquals(s, "world hello");
    }

    @Test
    public void reverseWords3() {
        Solution solution = new Solution();
        String s = solution.reverseWords("a good   example");
        assertEquals(s, "example good a");
    }
}