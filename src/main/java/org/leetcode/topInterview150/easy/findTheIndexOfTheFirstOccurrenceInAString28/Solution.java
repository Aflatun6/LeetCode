package org.leetcode.topInterview150.easy.findTheIndexOfTheFirstOccurrenceInAString28;

class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public int strStr2(String haystack, String needle) {
        boolean found = false;
        int theIndex = 0;
        A:
        for (int i = 0, j = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                theIndex = i;
                for (j = 0; j < needle.length(); j++) {
                    if (i + j >= haystack.length()) {
                        found = false;
                        break;
                    }
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        found = false;
                        break;
                    } else {
                        found = true;
                    }
                    if (j == needle.length() - 1) {
                        break A;
                    }
                }
                j = 0;
            }
        }
        return found ? theIndex : -1;
    }

    public int strStr3(String haystack, String needle) {
        boolean found = false;
        int theIndex = 0;
        A:
        for (int i = 0, j = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                theIndex = i;
                j++;
                found = true;
            }
            else {
                j = 0;
                found = false;
            }
            if (found && i + needle.length() > haystack.length()) {
                found = false;
                break;
            }
            if (found && j == needle.length()) {
                break;
            }
        }
        return found ? theIndex : -1;
    }

}