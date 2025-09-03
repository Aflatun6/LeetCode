package org.leetcode.topInterview150.easy.containsDuplicateII219;

class Solution {

    public static void main(String[] args) {
//        boolean b = new Solution().containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2);
        boolean b = new Solution().containsNearbyDuplicate(new int[]{99, 99}, 2);
        System.out.println(b);
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int j = (k + i) >= nums.length ? nums.length - 1 : (k + i);
            for (; j > i && j < nums.length; j--) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}