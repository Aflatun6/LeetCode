package org.leetcode.topInterview150.medium.rotateImage48;

class Solution {

    final int TIMES = 4;

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[][] rotated = solution.rotate(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}});
        print(rotated);
    }

    public int[][] rotate(int[][] matrix) {

        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = i; j < matrix.length - i - 1; j++) {
                matrix = rotateOne(matrix, i, j, 0, matrix[i][j]);
            }
        }

        return matrix;
    }

    private int[][] rotateOne(int[][] matrix, int i, int j, int current, int original) {
        if (current == TIMES) {
            return matrix;
        }
        int[] ints = reverseIndexes(new int[]{i, j}, matrix.length);
        int ii = ints[0];
        int jj = ints[1];
        current++;
        rotateOne(matrix, ii, jj, current, original);
        current--;
        if (current == 0) {
            matrix[ii][jj] = original;
        } else {
            matrix[ii][jj] = matrix[i][j];
        }
        return matrix;
    }

    private int[] reverseIndexes(int[] arr, int size) {
        int i = arr[0];
        int j, jj = arr[1];
        j = (size - 1) - i;
        i = jj;
        return new int[]{i, j};
    }


    private static void print(int[][] rotated) {
        for (int[] ints : rotated) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

}