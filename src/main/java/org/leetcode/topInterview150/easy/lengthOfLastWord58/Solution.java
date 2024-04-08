package org.leetcode.topInterview150.easy.lengthOfLastWord58;

class Solution {
    public int lengthOfLastWord2(String s) {
        int lastLen = 0;
        final char SPACE = ' ';
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != SPACE) {
                sum++;
                lastLen = sum;
                continue;
            }
            sum = 0;
        }
        return lastLen;
    }

    public int lengthOfLastWord(String s) {
        int lastLen = 0;
        final char SPACE = ' ';
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != SPACE) {
                lastLen++;
                continue;
            }
            if (lastLen > 0) {
                return lastLen;
            }
        }
        return lastLen;
    }
}