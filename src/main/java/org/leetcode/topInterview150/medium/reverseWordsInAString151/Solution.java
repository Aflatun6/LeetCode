package org.leetcode.topInterview150.medium.reverseWordsInAString151;

class Solution {

    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder subString = new StringBuilder();
        final char SPACE = ' ';
        boolean wasBlank = false;
        boolean wasLetter = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != SPACE) {
                if (wasBlank && wasLetter) {
                    result.insert(0, subString);
                    result.insert(0, SPACE);
                    subString = new StringBuilder();
                }
                subString.append(s.charAt(i));
                wasBlank = false;
                wasLetter = true;
            } else {
                wasBlank = true;
            }
        }
        result.insert(0, subString);

        return result
                .toString();
    }

    public String reverseWords2(String s) {
        s = s.trim();
        final String SPACE = " ";
        String[] strings = s.split(SPACE);
        StringBuilder result = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            result.append(strings[i]);
            if (i > 0 && !(strings[i].isEmpty() || strings[i].isBlank()))
                result.append(SPACE);
        }
        return result.toString();
    }
}