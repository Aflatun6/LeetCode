package org.leetcode.topInterview150.medium.bestTimeToBuyAndSellStock122;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
//        int i = new Solution().maxProfit2(new int[]{7, 1, 5, 3, 6, 4, 2, 7});
//        int i = new Solution().maxProfit2(new int[]{7, 1, 5, 3, 6, 4});
//        int i = new Solution().maxProfit2(new int[]{1, 2, 3, 4, 5});
        int i = new Solution().maxProfit2(new int[]{5, 4, 3, 2, 1});
        System.out.println(i);
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        int maxProfit = 0;
        int sumOfProfits = 0;
        int[][] ints = new int[prices.length][prices.length];
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices.length; j++) {
                ints[i][j] = prices[j] - prices[i];
            }
        }

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {

            }
        }
        Arrays.stream(ints).forEach(i -> System.out.println(Arrays.toString(i)));
        return profit;
    }

    public int maxProfit2(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int dividend = prices[i + 1] - prices[i];
            if (dividend > 0) {
                profit += dividend;
            }
        }
        return profit;
    }
}