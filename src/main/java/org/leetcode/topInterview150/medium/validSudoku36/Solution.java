package org.leetcode.topInterview150.medium.validSudoku36;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    boolean wasAdded = unique.add((int) board[i][j]);
                    if (!wasAdded) {
                        return false;
                    }
                }
            }
            unique.clear();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    boolean wasAdded = unique.add((int) board[j][i]);
                    if (!wasAdded) {
                        return false;
                    }
                }
            }
            unique.clear();
        }


        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (board[k][l] != '.') {
                            boolean wasAdded = unique.add((int) board[k][l]);
                            if (!wasAdded) {
                                return false;
                            }
                        }
                    }
                }
                unique.clear();
            }
        }

        return true;
    }
}