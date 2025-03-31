package org.leetcode.topInterview150.easy.summaryRanges228;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void summaryRanges() {
        Solution solution = new Solution();
        List<String> result = solution.summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
        assertArrayEquals(List.of("0->2", "4->5", "7").toArray(), result.toArray());
    }

    @Test
    public void summaryRanges2() {
        Solution solution = new Solution();
        List<String> result = solution.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9});
        assertArrayEquals(List.of("0", "2->4", "6", "8->9").toArray(), result.toArray());
    }
}