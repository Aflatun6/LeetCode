package org.leetcode.topInterview150.easy.majorityElement169;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Solution {

    public static void main(String[] args) {
//        int i = new Solution().majorityElement2(new int[]{2, 2, 1, 1, 1, 2, 2});
//        int i = new Solution().majorityElement2(new int[]{3, 3, 4});
        int i = new Solution().majorityElement3(new int[]{2, 1000, 2, 1001, 1000, 1000});
//        int i = new Solution().majorityElement2(new int[]{3, 4, 3});
        System.out.println(i);
    }

    public int majorityElement(int[] nums) {
        return Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted((e, e1) -> (int) (e1.getValue() - e.getValue()))
                .map(Map.Entry::getKey).findFirst().orElse(0);
    }

    public int majorityElement2(int[] array) {
        int length = array.length;
        int majority = length % 2 == 0 ? length / 2 : length / 2 + 1;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                else if(array[j] == array[j + 1]){
                    count++;
                    if (count == majority){
                        return array[j];
                    }
                }
            }
        }

        int max = 1;
        int el = array[0];
        for (int i = 1; i < array.length; i++) {
            if (el == array[i]) {
                max++;
            } else {
                max = 1;
                el = array[i];
            }

            if (max == majority) {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
        return el;
    }

    public int majorityElement3(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}