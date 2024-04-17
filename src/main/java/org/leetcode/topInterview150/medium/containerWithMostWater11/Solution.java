package org.leetcode.topInterview150.medium.containerWithMostWater11;

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxSum = 0;

        while (left != right) {
            int sum = Math.min(height[left], height[right]) * (right - left);
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxSum;
    }
}