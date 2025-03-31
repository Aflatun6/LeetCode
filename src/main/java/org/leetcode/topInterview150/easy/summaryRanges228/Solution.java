package org.leetcode.topInterview150.easy.summaryRanges228;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int counterForIncrement = 1;
        if (nums.length == 1) {
            return List.of(String.valueOf(nums[0]));
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                counterForIncrement = counterForIncrement + 1;
            } else {
                result.add(constructTheString(nums[i - 1], counterForIncrement));
                counterForIncrement = 1;
            }
            if (i == nums.length - 1) {
                result.add(constructTheString(nums[i], counterForIncrement));
            }
        }
        return result;
    }

    private String constructTheString(int num, int counterForIncrement) {
        return IntStream.of((num - counterForIncrement + 1), num)
                .distinct() // If the value is same
                .mapToObj(String::valueOf).collect(Collectors.joining("->"));
    }
}