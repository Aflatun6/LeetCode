package org.leetcode.topInterview150.easy.removeElement27;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int k = new Solution().removeElement(new int[]{3, 2, 2, 3}, 3);
        System.out.println(k);
    }

    public int removeElement(int[] nums, int val) {   //[3,2,2,3], val = 3 -> 2 & nums = [2,2,3,3]
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                len++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                for (int j = i; j < nums.length; j++){
                    if (nums[j] != val && j > i){
                        nums[i] = nums[j];
                        nums[j] = val;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length - len;
    }
}