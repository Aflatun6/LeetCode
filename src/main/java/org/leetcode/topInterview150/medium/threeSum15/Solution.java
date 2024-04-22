package org.leetcode.topInterview150.medium.threeSum15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {

    public static void main(String[] args) {
//        List<List<Integer>> lists = new Solution().threeSum2(new int[]{-1, 0, 1, 2, -1, -4});
        List<List<Integer>> lists = new Solution().threeSum3(new int[]{3, 0, -2, -1, 1, 2});
//        List<List<Integer>> lists = new Solution().threeSum3(new int[]{3, -2, 1, 0});
//        List<List<Integer>> lists = new Solution().threeSum3(new int[]{-2, 0, 1, 1, 2});
//        List<List<Integer>> lists = new Solution().threeSum3(new int[]{-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6});
//        List<List<Integer>> lists = new Solution().threeSum(new int[]{0, 1, 1});
//        List<List<Integer>> lists = new Solution().threeSum(new int[]{0, 0, 0});
        System.out.println(lists);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> ints = new ArrayList<>();
                        ints.add(nums[i]);
                        ints.add(nums[j]);
                        ints.add(nums[k]);
                        ints.sort(Comparator.naturalOrder());
                        if (!result.contains(ints)) {
                            result.add(ints);
                        }
                    }
                }
            }
        }
        return result;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        A:
        for (int i = 0; i < nums.length; i++) {
            B:
            for (int j = i + 1; j < nums.length; j++) {
                C:
                for (int k = j + 1; k < nums.length; k++) {
                    if (resultContains(result, nums[i], nums[j])) {
                        break C;
                    }
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> ints = new ArrayList<>();
                        ints.add(nums[i]);
                        ints.add(nums[j]);
                        ints.add(nums[k]);
                        ints.sort(Comparator.naturalOrder());
                        if (!result.contains(ints)) {
                            result.add(ints);
                        }
                        if (j == k - 1) {
                            j++;
                        }
                        break C;
                    }
                }
            }
        }
        return result;
    }

    private boolean resultContains(List<List<Integer>> result, int i, int j) {
        return result.stream().anyMatch(l -> l.get(0) == i && l.get(1) == j);
    }

    private boolean notInTheContains(List<List<Integer>> notInTheList, int i, int j, int toFind) {
        return notInTheList.stream().anyMatch(l -> l.get(0) == i && l.get(1) == j && l.get(2) == toFind);
    }

    public List<List<Integer>> threeSum3(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> notInTheList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 1; j++) {
                int toFind = -1 * (nums[i] + nums[j]);
                if (toFind < nums[j]) {
                    break;
                }
                if (notInTheContains(notInTheList, i, j, toFind)) {
                    continue;
                }
                if (resultContains(result, nums[i], nums[j])) {
                    continue;
                }
                boolean found = tryToFind(nums, toFind, j + 1, nums.length - 1);
                List<Integer> ints = new ArrayList<>();
                ints.add(nums[i]);
                ints.add(nums[j]);
                ints.add(toFind);
                ints.sort(Comparator.naturalOrder());
                if (found) {
                    if (!result.contains(ints)) {
                        result.add(ints);
                    }
                } else {
                    notInTheList.add(ints);
                }
            }
        }

        return result;
    }

    private boolean tryToFind(int[] nums, int toFind, int startIndex, int lastIndex) {
        if (toFind == nums[startIndex] || toFind == nums[lastIndex]) {
            return true;
        }
        if (toFind < nums[startIndex] || toFind > nums[lastIndex]) {
            return false;
        }
        if (lastIndex == startIndex || lastIndex - startIndex == 1) {
            return false;
        }
        int middle = ((startIndex + lastIndex) / 2);
        return toFind > nums[middle] ?
                tryToFind(nums, toFind, middle, lastIndex) :
                tryToFind(nums, toFind, startIndex, middle);

    }


    public List<List<Integer>> threeSum4(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    // Found a triplet with zero sum
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Skip duplicate elements for j
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    // Skip duplicate elements for k
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    // Move the pointers
                    j++;
                    k--;
                } else if (sum < 0) {
                    // Sum is less than zero, increment j to increase the sum
                    j++;
                } else {
                    // Sum is greater than zero, decrement k to decrease the sum
                    k--;
                }
            }
        }
        return ans;
    }


}