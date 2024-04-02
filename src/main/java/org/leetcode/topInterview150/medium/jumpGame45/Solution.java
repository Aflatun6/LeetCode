package org.leetcode.topInterview150.medium.jumpGame45;

import java.util.Arrays;

class Solution {
    public int jump(int[] nums) {
        int prev = 0, max = 0, jump = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (i == prev){
                jump++;
                prev = max;
            }
        }
        return jump;

    }
}