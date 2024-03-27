package org.leetcode.topInterview150.easy.mergeSortedArray88;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        new Solution().merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = nums1.length - n; i < nums1.length; i++) {
            nums1[i] = nums2[i - m];
        }

        for (int i = 0; i < nums1.length; i++) {
            for (int j = i; j < nums1.length; j++) {
                if (nums1[i] > nums1[j]) {
                    int swap = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = swap;
//                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}