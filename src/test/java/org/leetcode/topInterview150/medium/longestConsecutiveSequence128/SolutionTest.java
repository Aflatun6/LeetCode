package org.leetcode.topInterview150.medium.longestConsecutiveSequence128;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestConsecutive() {
        assertEquals(4, new Solution().longestConsecutive(new int[]{100, 4, 200, 1, 2, 3}));
    }

    @Test
    public void longestConsecutive2() {
        assertEquals(9, new Solution().longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }

    @Test
    public void longestConsecutive3() {
        assertEquals(3, new Solution().longestConsecutive(new int[]{1, 0, 1, 2}));
    }

    @Test
    public void longestConsecutive4() {
        assertEquals(1, new Solution().longestConsecutive(new int[]{0, 0}));
    }

    @Test
    public void longestConsecutive5() {
        assertEquals(0, new Solution().longestConsecutive(new int[]{}));
    }

    @Test
    public void longestConsecutive6() {
        assertEquals(7, new Solution().longestConsecutive(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6}));
    }

}
