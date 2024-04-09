package org.leetcode.topInterview150.medium.zigzagConversion6;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void convert() {
        Solution solution = new Solution();
        String convert = solution.convert("PAYPALISHIRING", 3);
        assertEquals(convert, "PAHNAPLSIIGYIR");
    }

    @Test
    public void convert2() {
        Solution solution = new Solution();
        String convert = solution.convert("PAYPALISHIRING", 4);
        assertEquals(convert, "PINALSIGYAHRPI");
    }

    @Test
    public void convert3() {
        Solution solution = new Solution();
        String convert = solution.convert("A", 1);
        assertEquals(convert, "A");
    }

    @Test
    public void convert4() {
        Solution solution = new Solution();
        String convert = solution.convert("AB", 1);
        assertEquals(convert, "AB");
    }
}