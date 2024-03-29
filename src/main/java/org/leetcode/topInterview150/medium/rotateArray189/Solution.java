package org.leetcode.topInterview150.medium.rotateArray189;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        new Solution().rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for (int i = 0; i< nums.length; i++){
            int rotatedIndex = (i + k) % nums.length;
            arr[rotatedIndex] = nums[i];
        }
        for (int i = 0; i< nums.length; i++){
            nums[i] = arr[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(arr));
    }

    public void rotate2(int[] nums, int k) {
        int rotations = nums.length % k == 0 ? nums.length / k : nums.length / k + 1;

        for (int i = 0; i < rotations; i++) {
            rotate(nums, i, nums[i], i, rotations);
        }
        System.out.println(Arrays.toString(nums));
    }

    int[] rotate(int[] nums, int ks, int remember, int index, int k) {
        if (ks == k) {
            return nums;
        }
        ks++;
        int rotatedIndex = (index + k) % nums.length;
        int toRemember = nums[rotatedIndex];
        nums[rotatedIndex] = nums[index];
        return rotate(nums, ks, toRemember, rotatedIndex, k);
    }
}