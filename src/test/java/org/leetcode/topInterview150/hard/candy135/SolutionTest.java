package org.leetcode.topInterview150.hard.candy135;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void candy() {
        Solution solution = new Solution();
        int candy = solution.candy(new int[]{1, 0, 2});
        assertEquals(candy, 5);
    }

    @Test
    public void candy2() {
        Solution solution = new Solution();
        int candy = solution.candy(new int[]{1, 2, 2});
        assertEquals(candy, 4);
    }

    @Test
    public void candy3() {
        Solution solution = new Solution();
        int candy = solution.candy(new int[]{1, 3, 2, 2, 1});
        assertEquals(candy, 7);
    }

    @Test
    public void candy4() {
        Solution solution = new Solution();
        int candy = solution.candy(new int[]{5, 4, 3, 2, 1});
        assertEquals(candy, 15);
    }

    @Test
    public void candy5() {
        Solution solution = new Solution();
        int candy = solution.candy(new int[]{19});
        assertEquals(candy, 1);
    }

    @Test
    public void candy6() {
        Solution solution = new Solution();
        int candy = solution.candy(new int[]{1, 2, 3, 2, 1});
        assertEquals(candy, 9);
    }

    @Test
    public void candy7() {
        Solution solution = new Solution();
        int candy = solution.candy(new int[]{1, 6, 10, 8, 7, 3, 2});
        assertEquals(candy, 18);
    }

    @Test
    public void candy8() {
        Solution solution = new Solution();
        int candy = solution.candy(new int[]{5, 3, 7, 3});
        assertEquals(candy, 6);
    }
}