package org.leetcode.topInterview150.medium.zigzagConversion6;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {

    public String convert2(String s, int numRows) {
        if (numRows < 1) {
            return null;
        }
        if (numRows == 1) {
            return s;
        }
        String[] array = new String[numRows];

        Arrays.fill(array, "");

        int count = 0;
        int rowIndex = 0;
        boolean goUp = false;
        boolean goDown = true;
        while (count < s.length()) {
            array[rowIndex] = array[rowIndex].concat(String.valueOf(s.charAt(count)));
            count++;

            if (rowIndex < numRows - 1 && goDown) {
                rowIndex++;
                continue;
            } else if (rowIndex == numRows - 1 && goDown) {
                rowIndex--;
                goUp = true;
                goDown = false;
                continue;
            }
            if (rowIndex > 0 && goUp) {
                rowIndex--;
            } else if (rowIndex == 0 && goUp) {
                rowIndex++;
                goUp = false;
                goDown = true;
            }
        }

        return String.join("", array);
    }

    public String convert(String s, int numRows) {
        if (numRows < 1) {
            return null;
        }
        if (numRows == 1) {
            return s;
        }
        String[] array = new String[numRows];

        Arrays.fill(array, "");

        int count = 0;
        int rowIndex = 0;
        boolean goUp = false;
        boolean goDown = false;
        while (count < s.length()) {
            array[rowIndex] = array[rowIndex].concat(String.valueOf(s.charAt(count)));
            count++;
            if (rowIndex % (numRows - 1) == 0) {
                if (goDown) {
                    goUp = true;
                    goDown = false;
                } else {
                    goUp = false;
                    goDown = true;
                }
            }
            if (goUp) {
                rowIndex--;
                continue;
            }
            rowIndex++;
        }

        return String.join("", array);
    }
}