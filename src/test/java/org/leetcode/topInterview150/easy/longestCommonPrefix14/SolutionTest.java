package org.leetcode.topInterview150.easy.longestCommonPrefix14;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestCommonPrefix() {
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        assertEquals(s, "fl");
    }

    @Test
    public void longestCommonPrefix2() {
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        assertEquals(s, "");
    }

    @Test
    public void longestCommonPrefix3() {
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(new String[]{"ab", "a"});
        assertEquals(s, "a");
    }

    @Test
    public void longestCommonPrefix4() {
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(new String[]{"cir", "car"});
        assertEquals(s, "c");
    }
}