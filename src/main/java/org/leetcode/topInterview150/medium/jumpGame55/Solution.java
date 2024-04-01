package org.leetcode.topInterview150.medium.jumpGame55;

class Solution {
    public boolean canJump2(int[] nums) {
        boolean canReach = false;
        int len = nums.length;
        int finalIndex = len - 1;
        if (len == 1) {
            return true;
        }
        for (int i = 0; i < len; i++) {
            int jump = nums[i];
            for (int j = jump + i; j < len && j >= 0; j--) {
                if (j >= finalIndex) {
                    return true;
                }
            }
        }

        return canReach;
    }

    public boolean canJump(int[] nums) {
        boolean canReach = true;
        boolean toCount = false;
        int amountToJump = 0;
        if (nums.length == 1) {
            return true;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                toCount = true;
                canReach = false;
//                continue;
            }
            if (toCount) {
                amountToJump++;
            }
            if (toCount) {
                if (amountToJump - 1 < nums[i] || nums[i] + i == nums.length - 1) {
                    toCount = false;
                    canReach = true;
                    amountToJump = 0;
                }
            }
        }

        return canReach;
    }

    public boolean canJump3(int[] nums) {
        int reach = 0;   // Initilize variable reach as 0, to store reach of the highest index.
        for (int i = 0; i < nums.length; i++) {   // Iterate the nums and check if reach is smaller than i then return false else overwrite reach with max of reach and i+nums[i].
            if (reach < i) {
                return false;
            }
            reach = Math.max(reach, i + nums[i]);
        }
        return true;   // return true, beacause we reach the last value of the array nums.
    }
}