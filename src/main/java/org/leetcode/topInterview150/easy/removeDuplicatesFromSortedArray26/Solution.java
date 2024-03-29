package org.leetcode.topInterview150.easy.removeDuplicatesFromSortedArray26;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
//        int i = new Solution().removeDuplicates(new int[]{1, 1, 2, 3, 3});
//        int i = new Solution().removeDuplicates2(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
//        int i = new Solution().removeDuplicates2(new int[]{1, 1});
//        int i = new Solution().removeDuplicates2(new int[]{1, 1, 1, 2});
        int i = new Solution().removeDuplicates3(new int[]{1, 1, 2, 1, 3});
        System.out.println(i);
    }

    public int removeDuplicates(int[] nums) { // [1,1,2,3,3] - 3 -> [1,2,3,_,_]
        System.out.println(Arrays.toString(nums));

        int dups = 0;
        int current = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (current == nums[i]) {
                dups++;
            }
            current = nums[i];
        }

        current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i >= nums.length - dups) {
                break;
            }
            if (current == nums[i]) {
                int tempI = i - 1;
                for (int j = i + 1; j < nums.length; j++) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
                i = tempI;
            }
            current = nums[i];
        }
        System.out.println(Arrays.toString(nums));

        return nums.length - dups;
    }

    public int removeDuplicates2(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int[] array = Arrays.stream(arr).boxed().distinct().sorted().mapToInt(i -> (int) i).toArray();
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        System.out.println(Arrays.toString(arr));
        return array.length;
    }

    public int removeDuplicates3(int[] arr) {
        int j = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[j]) {
                continue;
            }
            j++;
            arr[j] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        return ++j;
    }
}