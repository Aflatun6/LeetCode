package org.leetcode.topInterview150.medium.simplifyPath71;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void simplifyPath() {
        assertEquals("/home", new Solution().simplifyPath("/home/"));
    }

    @Test
    public void simplifyPath2() {
        assertEquals("/home/foo", new Solution().simplifyPath("/home//foo"));
    }

    @Test
    public void simplifyPath3() {
        assertEquals("/home/user/Pictures", new Solution().simplifyPath("/home/user/Documents/../Pictures"));
    }

    @Test
    public void simplifyPath4() {
        assertEquals("/", new Solution().simplifyPath("/../"));
    }

    @Test
    public void simplifyPath5() {
        assertEquals("/.../b/d", new Solution().simplifyPath("/.../a/../b/c/../d/./"));
    }
}