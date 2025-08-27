package org.leetcode.topInterview150.easy.isomorphicStrings205;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isIsomorphic() {
        assertTrue(new Solution().isIsomorphic("egg", "add"));
    }

    @Test
    public void isIsomorphic2() {
        assertFalse(new Solution().isIsomorphic("foo", "bar"));
    }

    @Test
    public void isIsomorphic3() {
        assertTrue(new Solution().isIsomorphic("paper", "title"));
    }

    @Test
    public void isIsomorphic4() {
        assertFalse(new Solution().isIsomorphic("badc", "baba"));
    }

    @Test
    public void isIsomorphic5() {
        assertFalse(new Solution().isIsomorphic("egcd", "adfd"));
    }

    @Test
    public void isIsomorphic6() {
        assertFalse(new Solution().isIsomorphic("baa", "aba"));
    }
}