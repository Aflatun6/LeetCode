package org.leetcode.topInterview150.hard.candy135;

import java.util.Arrays;

class Solution {

    public int candy2(int[] ratings) {
        int numOfCandies = ratings.length;
        int prevContinuity = 0;
        int nextContinuity = 0;
        Integer prev = null;
        Integer current = null;
        Integer next = null;
        boolean prevTrue = false;
        boolean nextTrue = false;
        for (int i = 0; i < ratings.length; i++) {
            if (i - 1 >= 0) {
                prev = ratings[i - 1];
            }
            if (i + 1 < ratings.length) {
                next = ratings[i + 1];
            } else {
                next = null;
            }
            current = ratings[i];

            if (prev != null && next != null && current > prev && current > next) {
                nextTrue = true;
                prevTrue = false;
                continue;
            }

            if (prev != null && prev > current && !nextTrue) {
                prevContinuity++;
                numOfCandies += prevContinuity;
            } else {
//                numOfCandies++;
                prevContinuity = 0;
                prevTrue = false;
            }
            if (next != null && next > current) {
                nextContinuity++;
                numOfCandies += nextContinuity;
                nextTrue = true;
            } else {
//                numOfCandies++;
                nextContinuity = 0;
                nextTrue = false;
            }

        }
        return numOfCandies;
    }

    public int candy3(int[] ratings) {
        int numOfCandies = ratings.length;
        int prevContinuity = 0;
        int nextContinuity = 0;
        Integer prev = null;
        Integer current = null;
        Integer next = null;
        boolean prevTrue = false;
        boolean nextTrue = false;
        for (int i = ratings.length - 1; i >= 0; i--) {
            if (i + 1 < ratings.length) {
                prev = ratings[i + 1];
            } else {
                prev = null;
            }
            if (i - 1 >= 0) {
                next = ratings[i - 1];
            } else {
                next = null;
            }
            current = ratings[i];

            if (prev != null && next != null && current > prev && current > next) {
                nextTrue = true;
                prevTrue = false;
                continue;
            }

            if (prev != null && prev > current && !nextTrue) {
                prevContinuity++;
                numOfCandies += prevContinuity;
                prevTrue = true;
            } else {
                prevContinuity = 0;
                prevTrue = false;
            }
            if (next != null && next > current && !prevTrue) {
                nextContinuity++;
                numOfCandies += nextContinuity;
                nextTrue = true;
            } else {
                nextContinuity = 0;
                nextTrue = false;
            }

        }
        return numOfCandies;
    }

    public int candy4(int[] ratings) {
        int numOfCandies1 = ratings.length;
        int prevContinuity = 0;
        int nextContinuity = 0;
        Integer prev = null;
        Integer current = null;
        Integer next = null;
        boolean prevTrue = false;
        boolean nextTrue = false;
        for (int i = 0; i < ratings.length; i++) {
            if (i - 1 >= 0) {
                prev = ratings[i - 1];
            }
            if (i + 1 < ratings.length) {
                next = ratings[i + 1];
            } else {
                next = null;
            }
            current = ratings[i];

            if (prev != null && next != null && current > prev && current > next) {
                continue;
            }

            if (prev != null && prev > current && !nextTrue) {
                prevContinuity++;
                numOfCandies1 += prevContinuity;
            } else {
                prevContinuity = 0;
                prevTrue = false;
            }
            if (next != null && next > current) {
                nextContinuity++;
                numOfCandies1 += nextContinuity;
                nextTrue = true;
            } else {
                nextContinuity = 0;
                nextTrue = false;
            }

        }
        int numOfCandies2 = ratings.length;
        prevContinuity = 0;
        nextContinuity = 0;
        prev = null;
        current = null;
        next = null;
        prevTrue = false;
        nextTrue = false;
        for (int i = ratings.length - 1; i >= 0; i--) {
            if (i + 1 < ratings.length) {
                prev = ratings[i + 1];
            }
            if (i - 1 >= 0) {
                next = ratings[i - 1];
            } else {
                next = null;
            }
            current = ratings[i];

            if (prev != null && next != null && current > prev && current > next) {
                continue;
            }

            if (prev != null && prev > current && !nextTrue) {
                prevContinuity++;
                numOfCandies2 += prevContinuity;
                prevTrue = true;
            } else {
                prevContinuity = 0;
                prevTrue = false;
            }
            if (next != null && next > current && !prevTrue) {
                nextContinuity++;
                numOfCandies2 += nextContinuity;
                nextTrue = true;
            } else {
                nextContinuity = 0;
                nextTrue = false;
            }

        }
        return Math.max(numOfCandies2, numOfCandies1);
    }

    public int candy(int[] ratings) {
        int len = ratings.length;
        int[] candies = new int[len];
        Integer prev = null;
        Integer current = null;
        Integer next = null;
        for (int i = 0; i < len; i++) {
            if (i - 1 >= 0) {
                prev = ratings[i - 1];
            } else {
                prev = null;
            }
            if (i + 1 < len) {
                next = ratings[i + 1];
            } else {
                next = null;
            }
            current = ratings[i];
            if (candies[i] == 0) {
                candies[i] = 1;
            }
            if (prev != null && prev == 0) {
                candies[i - 1] = 1;
            }
            if (next != null && next == 0) {
                candies[i + 1] = 1;
            }

            if (prev != null && next != null && current > prev && current > next) {
                candies[i] = Math.max(candies[i - 1], candies[i + 1]) + 1;
                continue;
            }

            if (prev != null && current > prev) {
                candies[i] = candies[i - 1] + 1;
            }

            if (next != null && current > next) {
                candies[i] = candies[i + 1] + 1;
            }
        }
        System.out.println(Arrays.toString(candies));


        for (int i = len - 1; i >= 0; i--) {
            if (i - 1 >= 0) {
                next = ratings[i - 1];
            } else {
                next = null;
            }
            if (i + 1 < len) {
                prev = ratings[i + 1];
            } else {
                prev = null;
            }
            current = ratings[i];

            if (prev != null && next != null && current > prev && current > next) {
                candies[i] = Math.max(candies[i + 1], candies[i - 1]) + 1;
                continue;
            }

            if (prev != null && current > prev) {
                candies[i] = candies[i + 1] + 1;
            }

            if (next != null && current > next) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        System.out.println(Arrays.toString(candies));
        return Arrays.stream(candies).sum();
    }


}