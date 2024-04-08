package org.leetcode.topInterview150.easy.longestCommonPrefix14;

class Solution {

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int firstLen = prefix.length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < prefix.length()) {
                int a = strs[i].length();
                prefix = prefix.substring(0, a);
                firstLen = prefix.length();
            }
            for (int j = 0; j < firstLen; j++) {
                if (strs[i].charAt(j) != prefix.charAt(j)) {
                    prefix = prefix.substring(0, j);
                    firstLen = prefix.length();
                }
            }
        }
        return prefix;
    }

    public String longestCommonPrefix2(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < prefix.length()) {
                prefix = prefix.substring(0, strs[i].length());
            }
            for (int j = 0; j < prefix.length(); j++) {
                if (strs[i].charAt(j) != prefix.charAt(j)) {
                    prefix = prefix.substring(0, j);
                }
            }
        }
        return prefix;
    }
}