package org.leetcode.topInterview150.easy.lengthOfLastWord58;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lengthOfLastWord() {
        Solution solution = new Solution();
        int word = solution.lengthOfLastWord("Hello World");
        assertEquals(word, 5);
    }

    @Test
    public void lengthOfLastWord2() {
        Solution solution = new Solution();
        int word = solution.lengthOfLastWord("   fly me   to   the moon  ");
        assertEquals(word, 4);
    }

    @Test
    public void lengthOfLastWord3() {
        Solution solution = new Solution();
        int word = solution.lengthOfLastWord("luffy is still joyboy");
        assertEquals(word, 6);
    }
}