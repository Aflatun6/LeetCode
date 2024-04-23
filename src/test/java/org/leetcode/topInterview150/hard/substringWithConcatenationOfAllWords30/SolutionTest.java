package org.leetcode.topInterview150.hard.substringWithConcatenationOfAllWords30;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findSubstring() {
        Solution solution = new Solution();
        List<Integer> result = solution.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"});
        List<Integer> expected = new ArrayList<>() {{
            add(0);
            add(9);
        }};
        assertEquals(expected, result);
    }

    @Test
    public void findSubstring2() {
        Solution solution = new Solution();
        List<Integer> result = solution.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"});
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    public void findSubstring3() {
        Solution solution = new Solution();
        List<Integer> result = solution.findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"});
        List<Integer> expected = new ArrayList<>() {{
            add(6);
            add(9);
            add(12);
        }};
        assertEquals(expected, result);
    }

    @Test
    public void findSubstring4() {
        Solution solution = new Solution();
        List<Integer> result = solution.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "good"});
        List<Integer> expected = new ArrayList<>() {{
            add(8);
        }};
        assertEquals(expected, result);
    }
}