package org.leetcode.topInterview150.hard.substringWithConcatenationOfAllWords30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int wordLen = words[0].length();
        int wordSize = words.length;
        int j = wordLen * wordSize;
        for (int i = 0; j <= s.length(); i++, j++) {
            String concatWords = s.substring(i, j);
            if (isAConcat(concatWords, words)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isAConcat(String concatWords, String[] words) {
        int wordLen = words[0].length();
        List<String> tempList = Arrays.stream(words).collect(Collectors.toList());
        String joined = String.join("", words);
        if (concatWords.equals(joined)) {
            return true;
        }
        for (int i = 0; i < concatWords.length(); i += wordLen) {
            String aWord = concatWords.substring(i, i + wordLen);
            if (tempList.contains(aWord)) {
                tempList.remove(aWord);
            } else {
                return false;
            }
            if (tempList.size() == 0) {
                return true;
            }
        }
        return false;
    }
}