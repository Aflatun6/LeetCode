package org.leetcode.topInterview150.medium.threeSum15;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void threeSum() {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        List<List<Integer>> actual = new ArrayList<>();
        actual.add(new ArrayList<>() {{
            add(-1);
            add(0);
            add(1);
        }});
        actual.add(new ArrayList<>() {{
            add(-1);
            add(-1);
            add(2);
        }});
        assertEquals(actual, result);
    }

    @Test
    public void threeSum2() {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.threeSum(new int[]{0, 1, 1});
        List<List<Integer>> actual = new ArrayList<>();
        assertEquals(actual, result);
    }

    @Test
    public void threeSum3() {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.threeSum(new int[]{0, 0, 0});
        List<List<Integer>> actual = new ArrayList<>();
        actual.add(new ArrayList<>() {{
            add(0);
            add(0);
            add(0);
        }});
        assertEquals(actual, result);
    }

    @Test
    public void threeSum4() {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.threeSum(new int[]{-2, 0, 1, 1, 2});
        List<List<Integer>> actual = new ArrayList<>();
        actual.add(new ArrayList<>() {{
            add(-2);
            add(0);
            add(2);
        }});
        actual.add(new ArrayList<>() {{
            add(-2);
            add(1);
            add(1);
        }});
        assertEquals(actual, result);
    }

    @Test
    public void threeSum5() {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.threeSum(new int[]{3, 0, -2, -1, 1, 2});
        List<List<Integer>> actual = new ArrayList<>();
        actual.add(new ArrayList<>() {{
            add(-2);
            add(-1);
            add(3);
        }});
        actual.add(new ArrayList<>() {{
            add(-2);
            add(0);
            add(2);
        }});

        actual.add(new ArrayList<>() {{
            add(-1);
            add(0);
            add(1);
        }});
        assertEquals(actual, result);
    }

    @Test
    public void threeSum6() {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.threeSum(new int[]{3, -2, 1, 0});
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, result);
    }
}