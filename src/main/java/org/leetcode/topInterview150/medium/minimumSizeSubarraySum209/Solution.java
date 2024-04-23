package org.leetcode.topInterview150.medium.minimumSizeSubarraySum209;

class Solution {

    public static void main(String[] args) {
//        int result = new Solution().minSubArrayLen2(7, new int[]{2, 3, 1, 2, 4, 3});
        int result = new Solution().minSubArrayLen2(7, new int[]{5});
//        int result = new Solution().minSubArrayLen2(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1});
//        int result = new Solution().minSubArrayLen2(7, new int[]{1, 1, 1, 1, 7});
        System.out.println(result);
    }

    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int minSumLen = Integer.MAX_VALUE;
        int currSumLen = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            currSumLen++;
            if (sum >= target) {
                return 1;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                currSumLen++;
                if (sum >= target) {
                    if (currSumLen < minSumLen) {
                        minSumLen = currSumLen;
                    }
                    break;
                }
            }
            sum = 0;
            currSumLen = 0;
        }

        return minSumLen > 1 && minSumLen != Integer.MAX_VALUE ? minSumLen : 0;
    }


    public int minSubArrayLen2(int target, int[] nums) {
        boolean stretch = true;
        boolean reachedTop = false;
        int currSum = 0;
        int currLen = 0;
        int minSumLen = Integer.MAX_VALUE;
        if (nums.length == 1) {
            return nums[0] >= target ? 1 : 0;
        }
        for (int i = 0, j = i + 1; i < nums.length; ) {
            if (nums[i] >= target || nums[j] >= target) {
                return 1;
            }
            if (i == 0 && j == 1) {
                currSum += nums[i];
                currLen++;
            }
            if (stretch) {
                currSum += nums[j];
                currLen++;
                if (j < nums.length - 1) {
                    j++;
                } else {
                    stretch = false;
                    reachedTop = true;
                }
            } else {
                currSum -= nums[i];
                currLen--;
                i++;
            }
            if (currSum >= target) {
                stretch = false;
                if (currLen < minSumLen) {
                    minSumLen = currLen;
                }
            } else {
                if (!reachedTop)
                    stretch = true;
            }
        }


        return minSumLen > 1 && minSumLen != Integer.MAX_VALUE ? minSumLen : 0;
    }

}