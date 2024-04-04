package org.leetcode.topInterview150.hard.trappingRainWater42;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int tra2(int[] height) {
        Map<Pair, Integer> pools = new HashMap<>();
        int len = height.length;
        int currentMax = Integer.MIN_VALUE;
        int startPool = Integer.MIN_VALUE;
        int endPool = Integer.MIN_VALUE;
        int sumOfObstacles = 0;
        int totalSum = 0;
        for (int i = 0; i < len; i++) {
            if (height[i] >= currentMax && height[i] > 0) {
                currentMax = height[i];
                if (startPool == Integer.MIN_VALUE) {
                    startPool = i;
                } else {
                    endPool = i;
                    int sum = ((endPool - startPool - 1) * Math.min(height[startPool], height[endPool])) - sumOfObstacles;
                    totalSum += sum;
                    sumOfObstacles = 0;
                    pools.put(new Pair(startPool, endPool), sum);
                    startPool = endPool;
                }
            }

            if (startPool > Integer.MIN_VALUE && startPool != i) {
                sumOfObstacles += height[i];
            }
        }

        currentMax = Integer.MIN_VALUE;
        startPool = Integer.MIN_VALUE;
        endPool = Integer.MIN_VALUE;
        sumOfObstacles = 0;

        for (int i = len - 1; i >= 0; i--) {
            if (height[i] >= currentMax && height[i] > 0) {
                currentMax = height[i];
                if (startPool == Integer.MIN_VALUE) {
                    startPool = i;
                } else {
                    endPool = i;
                    int sum = ((startPool - endPool - 1) * Math.min(height[startPool], height[endPool])) - sumOfObstacles;
                    totalSum += sum;
                    sumOfObstacles = 0;
                    pools.put(new Pair(endPool, startPool), sum);
                    startPool = endPool;
                }
            }

            if (startPool > Integer.MIN_VALUE && startPool != i) {
                sumOfObstacles += height[i];
            }
        }


        return pools.values().stream().mapToInt(i -> i).sum();
    }

    public int trap3(int[] height) {
        int len = height.length;
        int currentMax = Integer.MIN_VALUE;
        int nextMax = 0;
        int startPool = Integer.MIN_VALUE;
        int startMidPool = Integer.MIN_VALUE;
        int endPool = Integer.MIN_VALUE;
        int endMidPool = Integer.MIN_VALUE;
        int sumOfObstacles = 0;
        int sumOfMidObstacles = 0;
        int totalSum = 0;
        int totalMidSum = 0;
        boolean maxFound = false;
        for (int i = 0; i < len; i++) {
            if (height[i] >= currentMax) {
                if (height[i] > 0) {
                    currentMax = height[i];
                    maxFound = true;
                    if (startPool == Integer.MIN_VALUE) {
                        startPool = i;
                        startMidPool = startPool;
                    } else {
                        endPool = i;
                        int sum = ((endPool - startPool - 1) * Math.min(height[startPool], height[endPool])) - sumOfObstacles;
                        totalSum += sum;
                        sumOfObstacles = 0;
                        sumOfMidObstacles = 0;
                        startPool = endPool;
                        startMidPool = startPool;
                    }
                }
            } else {
                if (height[i] >= nextMax) {
                    if (maxFound) {
                        totalMidSum = 0;
                    }
                    maxFound = false;
                    nextMax = height[i];
                    endMidPool = i;
                    int sum = ((endMidPool - startMidPool - 1) * Math.min(height[startMidPool], height[endMidPool])) - sumOfMidObstacles;
                    totalMidSum += sum;
                    sumOfMidObstacles = 0;
                    startMidPool = endMidPool;
                }
            }


            if (startPool > Integer.MIN_VALUE && startPool != i) {
                sumOfObstacles += height[i];
            }

            if (startMidPool > Integer.MIN_VALUE && startMidPool != i) {
                sumOfMidObstacles += height[i];
            }
        }

        if (!maxFound) {
            totalSum += totalMidSum;
        }

        return totalSum;
    }


    public int trap(int[] height) {
        int len = height.length;
        int globalMax = Integer.MIN_VALUE;
        int currentMax = Integer.MIN_VALUE;
        int sumOfEverything = 0;
        int sumOfBlocks = 0;
        int numOfGlobals = 1;
        int firstIndex = 0;
        int secondIndex = 0;
        for (int h : height) {
            sumOfBlocks += h;
            if (h >= globalMax) {
                if (h > globalMax) {
                    numOfGlobals = 1;
                } else {
                    numOfGlobals++;
                }
                globalMax = h;
            }
        }

        for (int i = 0; i < len; i++) {
            firstIndex = i;
            if (height[i] > currentMax) {
                currentMax = height[i];
            }
            sumOfEverything += currentMax;
            if (currentMax == globalMax) {
                currentMax = Integer.MIN_VALUE;
                break;
            }
        }
        for (int i = len - 1; i > firstIndex; i--) {
            if (height[i] > currentMax) {
                currentMax = height[i];
            }
            sumOfEverything += currentMax;
            if (currentMax == globalMax) {
                secondIndex = i;
                break;
            }
        }
        if (numOfGlobals > 1) {
            sumOfEverything += (secondIndex - firstIndex - 1) * globalMax;
        }

        return sumOfEverything - sumOfBlocks;
    }
}