package org.leetcode.topInterview150.easy.findTheIndexOfTheFirstOccurrenceInAString28;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void strStr() {
        Solution solution = new Solution();
        int result = solution.strStr("sadbutsad", "sad");
        assertEquals(result, 0);
    }

    @Test
    public void strStr2() {
        Solution solution = new Solution();
        int result = solution.strStr("leetcode", "leeto");
        assertEquals(result, -1);
    }
}