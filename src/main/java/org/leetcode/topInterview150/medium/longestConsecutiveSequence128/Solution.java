package org.leetcode.topInterview150.medium.longestConsecutiveSequence128;

import java.util.*;
import java.util.stream.Collectors;

class Solution {

    public static void main(String[] args) {
        int result = new Solution().longestConsecutive(new int[]{100, 4, 200, 1, 2, 3});
//        int result = new Solution().longestConsecutive(new int[]{100, 4, 200, 5, 6, 7});
//        int result = new Solution().longestConsecutive(new int[]{1, 0, 1, 2});
//        int result = new Solution().longestConsecutive(new int[]{0, 0});
        System.out.println(result);
    }

    public int longestConsecutive2(int[] nums) {
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

    public int longestConsecutive3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        Set<Integer> hasBeenUsed = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if ((set.contains(nums[i] - 1) || set.contains(nums[i] + 1)) && !hasBeenUsed.contains(nums[i])) {
                hasBeenUsed.add(nums[i]);
                map.merge(nums[i], 1, Integer::sum);
            }
        }
        return map.values().stream().max((a, b) -> a - b).get();
    }

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        List<Integer> collect = Arrays.stream(nums).distinct().sorted().boxed().collect(Collectors.toList());
        int count = 1;
        int max = 1;
        for (int i = 0, j = i + 1; j < collect.size(); i++, j++) {
            if (collect.get(i) == collect.get(j) - 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            }
            else {
                count = 1;
            }
        }
        return max;
    }
}