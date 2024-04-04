package org.leetcode.topInterview150.easy.romanToInteger13;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void romanToInt() {
        Solution solution = new Solution();
        int iii = solution.romanToInt("III");
        assertEquals(iii, 3);
    }

    @Test
    public void romanToInt2() {
        Solution solution = new Solution();
        int lviii = solution.romanToInt("LVIII");
        assertEquals(lviii, 58);
    }

    @Test
    public void romanToInt3() {
        Solution solution = new Solution();
        int mcmxciv = solution.romanToInt("MCMXCIV");
        assertEquals(mcmxciv, 1994);
    }
}