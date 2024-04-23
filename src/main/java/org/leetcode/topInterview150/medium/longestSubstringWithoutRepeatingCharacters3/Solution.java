package org.leetcode.topInterview150.medium.longestSubstringWithoutRepeatingCharacters3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        int result = new Solution().lengthOfLongestSubstring("cdd");
        System.out.println(result);
    }

    public int lengthOfLongestSubstring(String s) {
        int currLen = 0;
        int maxLen = 0;
        List<Character> chars = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (chars.contains(c)) {
                maxLen = Math.max(maxLen, currLen);
                int indexOf = chars.indexOf(c);
                currLen -= indexOf;
                chars = chars.subList(indexOf + 1, chars.size());
                chars.add(c);
                continue;
            }
            chars.add(c);
            currLen++;
        }
        return Math.max(maxLen, currLen);
    }
}