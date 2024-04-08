package org.leetcode.topInterview150.medium.integerToRoman12;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void intToRoman() {
        Solution solution = new Solution();
        String s = solution.intToRoman(3);
        assertEquals(s, "III");
    }

    @Test
    public void intToRoman2() {
        Solution solution = new Solution();
        String s = solution.intToRoman(58);
        assertEquals(s, "LVIII");
    }

    @Test
    public void intToRoman3() {
        Solution solution = new Solution();
        String s = solution.intToRoman(1994);
        assertEquals(s, "MCMXCIV");
    }
}