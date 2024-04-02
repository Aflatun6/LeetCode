package org.leetcode.topInterview150.medium.hIndex274;

import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length;
        if (len == 1) {
            return citations[0] >= 1 ? 1 : 0;
        }
        int currentMax = 0;
        for (int i = 0; i < len; i++) {
            if (len - i >= citations[i]) {
                currentMax = citations[i];
            } else if (citations[i] > i) {
                if (currentMax <= len - i) {
                    currentMax = len - i;
                    break;
                }
            }
        }
        return currentMax;
    }
}