package org.leetcode.topInterview150.medium.removeDuplicatesFromSortedArray80;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
//        int i = new Solution().removeDuplicates(new int[]{1, 1, 1, 2, 2, 3});
        int i = new Solution().removeDuplicates3(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3});
//        int i = new Solution().removeDuplicates3(new int[]{1, 1, 1, 1, 2, 2, 3});
//        int i = new Solution().removeDuplicates(new int[]{0, 0, 0, 0, 0, 1});
//        int i = new Solution().removeDuplicates2(new int[]{1, 1, 1, 1});
//        int i = new Solution().removeDuplicates2(new int[]{1});
        System.out.println(i);
    }

    public int removeDuplicates(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int counter = 0;
        int j = 0;
        boolean updated = false;
        for (int i = 0; i < nums.length; i++) {
            counter++;
            if (nums[j] == nums[i]) {
                if (counter <= 2) {
                    continue;
                }
            } else {
                updated = true;
            }

            if (updated) {
                j += counter >= 2 ? 2 : 1;
                nums[j] = nums[i];
                counter = 1;
            }
        }
        System.out.println(Arrays.toString(nums));
        return ++j;
    }


    public int removeDuplicates2(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int counter = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] == nums[i]) {
                counter++;
                if (i == nums.length - 1) {
                    if (j == nums.length - 1) {
                        break;
                    }
                    j++;
                    nums[j] = nums[i];
                }
                continue;
            }
            j += counter >= 2 ? 2 : 1;
            nums[j] = nums[i];
            counter = 1;
        }
        System.out.println(Arrays.toString(nums));
        return ++j;
    }

    public int removeDuplicates3(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            if (j == 1 || nums[i] != nums[j - 2]) {
                nums[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return j;
    }
}