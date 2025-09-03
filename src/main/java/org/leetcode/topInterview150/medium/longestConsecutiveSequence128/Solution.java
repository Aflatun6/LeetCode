package org.leetcode.topInterview150.medium.longestConsecutiveSequence128;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {

    public static void main(String[] args) {
//        int result = new Solution().longestConsecutive(new int[]{100, 4, 200, 1, 2, 3});
//        int result = new Solution().longestConsecutive(new int[]{100, 4, 200, 5, 6, 7});
//        int result = new Solution().longestConsecutive(new int[]{1, 0, 1, 2});
        int result = new Solution().longestConsecutive(new int[]{0, 0});
        System.out.println(result);
    }

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        Set<Integer> hasBeenUsed = new HashSet<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((set.contains(nums[i] - 1) || set.contains(nums[i] + 1)) && !hasBeenUsed.contains(nums[i])) {
                hasBeenUsed.add(nums[i]);
                count++;
            }
        }
        return count == 0 ? 1 : count;
    }
}