package org.leetcode.topInterview150.medium.spiralMatrix54;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
//        List<Integer> result = new Solution().spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
//        List<Integer> result = new Solution().spiralOrder(new int[][]{{1}});
//        List<Integer> result = new Solution().spiralOrder(new int[][]{{3}, {2}});
        List<Integer> result = new Solution().spiralOrder(new int[][]{{2, 5, 8}, {4, 0, -1}});
        System.out.println(result);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int maxJ = matrix[0].length - 1;
        int maxI = matrix.length - 1;
        int minJ = 0, minI = 0;
        boolean maxJFlipped = false, maxIFlipped = false, minJFlipped = true, minIFlipped = false;

        for (int i = 0, j = 0; minI <= maxI && minJ <= maxJ; ) {
            if (res.size() == matrix.length * matrix[0].length) {
                break;
            }
            if (i == minI && j < maxJ) {
                res.add(matrix[i][j]);
                j++;
                continue;
            }
            if (i == minI && j == maxJ) {
                if (j > maxJ) {
                    j--;
                }
                res.add(matrix[i][j]);
                i++;

                continue;
            }
            if ((i < maxI) && j == maxJ) {
                res.add(matrix[i][j]);
                i++;
                continue;
            }
            if (i == maxI && j == maxJ) {
                res.add(matrix[i][j]);
                j--;
                minI++;
                continue;
            }
            if ((i == maxI) && j > minJ) {
                res.add(matrix[i][j]);
                j--;
                continue;
            }
            if (i == maxI && j == minJ) {
                res.add(matrix[i][j]);
                i--;
                maxI--;
                maxJ--;
                continue;
            }

        }

        return res;
    }
}