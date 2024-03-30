package org.leetcode.topInterview150.easy.bestTimeToBuyAndSellStock121;

class Solution {
    public static void main(String[] args) {
//        int i = new Solution().maxProfit2(new int[]{7, 1, 5, 3, 6, 4});
//        int i = new Solution().maxProfit2(new int[]{2, 1, 2, 1, 0, 1, 2});
        int i = new Solution().maxProfit2(new int[]{3, 3, 5, 0, 0, 3, 1, 4});
//        int i = new Solution().maxProfit2(new int[]{7, 6, 4, 3, 1});
        System.out.println(i);
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (profit < prices[j] - prices[i]) {
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
    }

    public int maxProfit2(int[] prices) {
        int sellNow = Integer.MIN_VALUE;
        int buyNow = Integer.MAX_VALUE;
        boolean haveBought = false;
        boolean newBuy = false;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyNow) {
                buyNow = prices[i];
                if (haveBought) {
                    newBuy = true;
                }
                haveBought = true;
                continue;
            }

            if (haveBought) {
                if (newBuy) {
                    sellNow = Integer.MIN_VALUE;
                }
                if (sellNow <= prices[i]) {
                    sellNow = prices[i];
                    if (profit <= sellNow - buyNow) {
                        profit = sellNow - buyNow;
                    }
                }
            }
        }

        return Math.max(profit, 0);
    }

}