package org.leetcode.topInterview150.medium.groupAnagrams49;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void groupAnagrams() {
        Solution s = new Solution();
        List<List<String>> result = s.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        List<List<String>> expected = Arrays.asList
                (Arrays.asList("eat", "tea", "ate"), Arrays.asList("tan", "nat"), List.of("bat"));
        assertEquals(expected, result);
    }

    @Test
    public void groupAnagrams2() {
        Solution s = new Solution();
        List<List<String>> result = s.groupAnagrams(new String[]{""});
        assertEquals(List.of(List.of("")), result);
    }

    @Test
    public void groupAnagrams3() {
        Solution s = new Solution();
        List<List<String>> result = s.groupAnagrams(new String[]{"a"});
        assertEquals(List.of(List.of("a")), result);
    }
}