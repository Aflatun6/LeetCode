package org.leetcode.topInterview150.medium.bestTimeToBuyAndSellStock122;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxProfit12() {
        Solution solution = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4, 2, 7};
        int maxProfit = solution.maxProfit2(prices);
        assertEquals(maxProfit, 12);
    }

    @Test
    public void maxProfit4() {
        Solution solution = new Solution();
        int[] prices = {1, 2, 3, 4, 5};
        int maxProfit = solution.maxProfit2(prices);
        assertEquals(maxProfit, 4);
    }
}