package org.leetcode.topInterview150.easy.validParantheses20;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isValid() {
        assertTrue(new Solution().isValid("()"));
    }

    @Test
    public void isValid2() {
        assertTrue(new Solution().isValid("()[]{}"));
    }

    @Test
    public void isValid3() {
        assertFalse(new Solution().isValid("(}"));
    }

    @Test
    public void isValid4() {
        assertTrue(new Solution().isValid("([])"));
    }

    @Test
    public void isValid5() {
        assertFalse(new Solution().isValid("([)]"));
    }

    @Test
    public void isValid6() {
        assertFalse(new Solution().isValid("(("));
    }

    @Test
    public void isValid7() {
        assertFalse(new Solution().isValid("){"));
    }
}