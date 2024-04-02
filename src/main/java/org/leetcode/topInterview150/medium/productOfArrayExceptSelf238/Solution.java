package org.leetcode.topInterview150.medium.productOfArrayExceptSelf238;

import java.util.Arrays;

class Solution {
    public int[] productExceptSelf3(int[] nums) { // NOT O(N). USES O(N^2)
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    result[i] *= nums[j];
                }
            }
        }
        return result;
    }

    public int[] productExceptSelf2(int[] nums) { // USES / OPERATION
        int product = 1;
        int zeroCount = 0;
        for (int num : nums) {
            if (num != 0) {
                product *= num;
            }
            if (num == 0) {
                zeroCount++;
            }
        }
        if (zeroCount > 1) {
            product = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 0) {
                if (nums[i] == 0) {
                    nums[i] = product;
                } else {
                    nums[i] = 0;
                }
            } else {
                nums[i] = product / nums[i];
            }
        }
        return nums;
    }

    public int[] productExceptSelf(int[] nums) { // Not a good solution due to taking a lot of time to complete, but VALID
        int product = 1;
        int zeroCount = 0;
        for (int num : nums) {
            if (num != 0) {
                product *= num;
            }
            if (num == 0) {
                zeroCount++;
            }
        }
        if (zeroCount > 1) {
            product = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 0) {
                if (nums[i] == 0) {
                    nums[i] = product;
                } else {
                    nums[i] = 0;
                }
            } else {
                nums[i] = getQuotient(product, nums[i]);
            }
        }
        return nums;
    }

    private int getQuotient(int dividend, int divisor) {
        int quotient = 0;
        int sign = 1;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            sign *= -1;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while (dividend >= divisor) {
            quotient++;
            dividend -= divisor;
        }
        return sign * quotient;
    }
}