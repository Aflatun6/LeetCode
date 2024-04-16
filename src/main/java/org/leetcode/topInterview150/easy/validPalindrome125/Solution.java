package org.leetcode.topInterview150.easy.validPalindrome125;

import java.util.stream.Collectors;

class Solution {
    final int ASCII_NUMBER_START = 48;
    final int ASCII_NUMBER_END = 57;
    final int ASCII_UPPER_LETTER_START = 65;
    final int ASCII_UPPER_LETTER_END = 90;
    final int ASCII_LOWER_LETTER_START = 97;
    final int ASCII_LOWER_LETTER_END = 122;
    final int ASCII_TO_LOWERCASE_DIFFERENCE = 32;


    public boolean isPalindrome2(String s) {
        String string = s.chars().filter(this::isAlphaNumeric).map(this::toLowerCase)
                .mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining());
        int len = string.length();
        for (int i = 0, j = len - 1; i < len / 2; i++, j--) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0, j = len - 1; i < len && j >= 0; ) {
            char left = s.charAt(i);
            char right = s.charAt(j);
            if (i == j) {
                break;
            }
            if (!isAlphaNumeric(left)) {
                i++;
                continue;
            }
            if (!isAlphaNumeric(right)) {
                j--;
                continue;
            }

            left = (char) toLowerCase(left);
            right = (char) toLowerCase(right);

            if (left != right) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    private int toLowerCase(int character) {
        if (character >= ASCII_UPPER_LETTER_START && character <= ASCII_UPPER_LETTER_END) {
            return character + ASCII_TO_LOWERCASE_DIFFERENCE;
        }
        return character;
    }

    private boolean isAlphaNumeric(int character) {
        if (character >= ASCII_NUMBER_START && character <= ASCII_NUMBER_END) {
            return true;
        } else if (character >= ASCII_UPPER_LETTER_START && character <= ASCII_UPPER_LETTER_END) {
            return true;
        } else return character >= ASCII_LOWER_LETTER_START && character <= ASCII_LOWER_LETTER_END;
    }
}