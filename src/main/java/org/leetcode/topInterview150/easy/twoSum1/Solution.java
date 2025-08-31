package org.leetcode.topInterview150.easy.twoSum1;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int currentSum = 0;
        for (int i = 0, j = i + 1; j < nums.length; j++) {
            currentSum = nums[i] + nums[j];
            if (currentSum == target) {
                return new int[]{i, j};
            }
            if (j == nums.length - 1) {
                i++;
                j = i;
            }
        }
        return null;
    }
}