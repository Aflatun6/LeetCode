package org.leetcode.topInterview150.medium.jumpGame45;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void jump() {
        Solution solution = new Solution();
        int jump = solution.jump(new int[]{2, 3, 1, 1, 4});
        assertEquals(jump, 2);
    }

    @Test
    public void jump2() {
        Solution solution = new Solution();
        int jump = solution.jump(new int[]{2, 3, 0, 1, 4});
        assertEquals(jump, 2);
    }

    @Test
    public void jump21() {
        Solution solution = new Solution();
        int jump = solution.jump(new int[]{2, 1});
        assertEquals(jump, 1);
    }

    @Test
    public void jump12111() {
        Solution solution = new Solution();
        int jump = solution.jump(new int[]{1, 2, 1, 1, 1});
        assertEquals(jump, 3);
    }

}