package org.leetcode.topInterview150.easy.isSubsequence392;

class Solution {

    public boolean isSubsequence(String s, String t) {
        int sCount = 0;
        for (int i = 0, j = 0; i < t.length() && j < s.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
                sCount++;
            }
        }
        return sCount == s.length();
    }
}