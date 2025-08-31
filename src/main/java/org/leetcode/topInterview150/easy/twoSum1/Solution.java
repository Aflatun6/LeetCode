package org.leetcode.topInterview150.easy.twoSum1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int complement = target - currentNum;

            // Check if the complement exists in the map.
            if (numMap.containsKey(complement)) {
                // If it exists, we have found the two numbers.
                // Return the index of the complement and the current index.
                return new int[]{numMap.get(complement), i};
            }

            // If the complement is not found, add the current number and its index to the map.
            numMap.put(currentNum, i);
        }
        return null;
    }
}