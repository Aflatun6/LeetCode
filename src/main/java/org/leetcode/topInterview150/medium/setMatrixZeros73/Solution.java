package org.leetcode.topInterview150.medium.setMatrixZeros73;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    class Coordinates {
        int x;
        int y;

        public Coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] initial = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] set = solution.setZeroes(initial);
    }

    public int[][] setZeroes(int[][] matrix) {
        List<Coordinates> coordinates = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    coordinates.add(new Coordinates(i, j));
                }
            }
        }
        return populateZeros(matrix, coordinates);
    }

    private int[][] populateZeros(int[][] matrix, List<Coordinates> coordinates) {
        coordinates.stream().map(Coordinates::getX).distinct().forEach(x -> setRowToZer0(x, matrix));
        coordinates.stream().map(Coordinates::getY).distinct().forEach(y -> setColumnToZer0(y, matrix));
        return matrix;
    }

    private void setRowToZer0(int row, int[][] matrix) {
        Arrays.fill(matrix[row], 0);
    }

    private void setColumnToZer0(int column, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }

    private static void print(int[][] set) {
        for (int[] ints : set) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

}