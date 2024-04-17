package org.leetcode.topInterview150.medium.twoSumII_InputArrayIsSorted167;

class Solution {
    public int[] twoSum2(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = Math.min(i, j) + 1;
                    result[1] = Math.max(i, j) + 1;
                    break;
                }
            }
        }
        return result;
    }

    public int[] twoSum3(int[] numbers, int target) {
        for (int i = 0, j = 1; j < numbers.length && i < j; ) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i + 1, j + 1};
            }
            if (numbers[i] + numbers[j] > target || j == numbers.length - 1) {
                j = i + 2;
                i++;
                continue;
            }
            j++;
        }
        return null;
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{left + 1, right + 1};
    }
}