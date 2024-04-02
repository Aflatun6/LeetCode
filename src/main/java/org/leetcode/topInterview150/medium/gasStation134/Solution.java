package org.leetcode.topInterview150.medium.gasStation134;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
//        int i = new Solution().canCompleteCircuit3(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2});
        int i = new Solution().canCompleteCircuit3(
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0});
//        int i = new Solution().canCompleteCircuit3(new int[]{2, 3, 4}, new int[]{3, 4, 3});
//        int i = new Solution().canCompleteCircuit3(new int[]{3, 3, 4}, new int[]{3, 4, 4});
//        int i = new Solution().canCompleteCircuit3(new int[]{5, 1, 2, 3, 4}, new int[]{4, 4, 1, 5, 1});
        System.out.println(i);
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int[] counters = new int[len];
        int totalIterations = 0;

        A:
        for (int i = 0; i < len; i++) {
            B:
            for (int j = i; j < len + i; j++) {
                totalIterations++;
                int index = j % len;
                counters[i] += gas[index] - cost[index];
                if (counters[i] < 0) {
                    break B;
                }
            }
        }
        System.out.println("total iterations for length - " + len + " is - " + totalIterations);
        for (int i = 0; i < len; i++) {
            if (counters[i] >= 0) {
                return i;
            }
        }

        return -1;
    }

    public int canCompleteCircuit2(int[] gas, int[] cost) {
        int len = gas.length;
        int sum = 0;
        int startIndex = 0;
        int currentIndex = 0;
        int counter = 1;
        int totalCounter = 0;
        int totalIterations = 0;
        while (counter <= len) {
            totalIterations++;
            int index = currentIndex % len;
            sum += gas[index] - cost[index];
            currentIndex++;
            if (sum < 0) {
                startIndex++;
                currentIndex = startIndex;
                sum = 0;
                counter = 1;
                totalCounter++;
                if (totalCounter == len) {
                    startIndex = -1;
                    break;
                }
                continue;
            }
            counter++;
        }
        System.out.println("total iterations for length - " + len + " is - " + totalIterations);
        return startIndex;
    }

    public int canCompleteCircuit3(int[] gas, int[] cost) {
        int len = gas.length;
        int sum = 0;
        int startIndex = 0;
        int currentIndex = 0;
        int counter = 1;
        int totalCounter = 0;
        int totalIterations = 0;
        while (counter <= len) {
            totalIterations++;
            int index = currentIndex % len;
            sum += gas[index] - cost[index];
            currentIndex++;
            if (sum < 0) {
                startIndex = currentIndex;
                sum = 0;
                counter = 1;
                totalCounter++;
                if (totalCounter == len) {
                    startIndex = -1;
                    break;
                }
                continue;
            }
            counter++;
        }
        System.out.println("total iterations for length - " + len + " is - " + totalIterations);
        return startIndex;
    }

    public int canCompleteCircuit4(int[] gas, int[] cost) {
        int len = gas.length;
        int sum = 0;
        int totalSum = 0;
        int index = 0;
        for (int i = 0; i < len; i++) {
            totalSum += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if (sum < 0) {
                sum = 0;
                index = i + 1;
            }
        }

        return totalSum < 0 ? -1 : index;
    }


}