package org.leetcode.topInterview150.easy.validAnagram242;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isAnagram() {
        assertTrue(new Solution().isAnagram("anagram", "nagaram"));
    }

    @Test
    public void isAnagram2() {
        assertFalse(new Solution().isAnagram("rat", "car"));
    }
}