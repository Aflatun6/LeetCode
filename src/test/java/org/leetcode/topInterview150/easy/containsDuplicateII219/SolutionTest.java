package org.leetcode.topInterview150.easy.containsDuplicateII219;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void containsNearbyDuplicate() {
        assertTrue(new Solution().containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }

    @Test
    public void containsNearbyDuplicate2() {
        assertTrue(new Solution().containsNearbyDuplicate(new int[]{1, 1, 0, 1}, 1));
    }

    @Test
    public void containsNearbyDuplicate3() {
        assertFalse(new Solution().containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}