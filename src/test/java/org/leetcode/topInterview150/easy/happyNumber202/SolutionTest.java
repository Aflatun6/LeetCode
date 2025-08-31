package org.leetcode.topInterview150.easy.happyNumber202;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isHappy() {
        assertTrue(new Solution().isHappy(19));
    }

    @Test
    public void isHappy2() {
        assertFalse(new Solution().isHappy(2));
    }

    @Test
    public void isHappy3() {
        assertTrue(new Solution().isHappy(1));
    }

    @Test
    public void isHappy4() {
        assertTrue(new Solution().isHappy(7));
    }
}