package org.leetcode.topInterview150.medium.gameOfLife289;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

class Solution {

    @ToString
    class Coordinates {
        int x;
        int y;
        int current;
        int neighbours;

        public Coordinates(int x, int y, int current, int neighbours) {
            this.x = x;
            this.y = y;
            this.current = current;
            this.neighbours = neighbours;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public int getNeighbours() {
            return neighbours;
        }

        public int getCurrent() {
            return current;
        }
    }

    public static void main(String[] args) {
//        int[][] ints = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int[][] ints = {{1, 1}, {1, 0}};
        print(ints);
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        int[][] result = new Solution().gameOfLife(ints);
        print(result);
    }

    private static void print(int[][] set) {
        for (int[] ints : set) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }


    public int[][] gameOfLife(int[][] board) {
        List<Coordinates> coordinates = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                coordinates.add(new Coordinates(i, j, board[i][j], setNeighbours(i, j, board)));
            }
        }
        return updateBoard(board, coordinates);

    }

    private int[][] updateBoard(int[][] board, List<Coordinates> coordinates) {

        coordinates.stream().iterator().forEachRemaining(c -> {
            if (c.current == 1) {
                if (c.neighbours < 2 || c.neighbours > 3) {
                    board[c.x][c.y] = 0;
                }
            }
            if (c.current == 0 && c.neighbours == 3) {
                board[c.x][c.y] = 1;
            }
        });
        return board;
    }

    private int setNeighbours(int i, int j, int[][] board) {
        int currentAliveNeighbours = 0;
        if (i > 0) {
            if (j > 0) {
                if (board[i - 1][j - 1] == 1) currentAliveNeighbours++;
            }
            if (board[i - 1][j] == 1) currentAliveNeighbours++;
            if (j < board[i].length - 1) {
                if (board[i - 1][j + 1] == 1) currentAliveNeighbours++;
            }
        }
        if (i < board.length - 1) {
            if (j > 0) {
                if (board[i + 1][j - 1] == 1) currentAliveNeighbours++;
            }
            if (board[i + 1][j] == 1) currentAliveNeighbours++;
            if (j < board[i].length - 1) {
                if (board[i + 1][j + 1] == 1) currentAliveNeighbours++;
            }
        }

        if (j > 0) {
            if (board[i][j - 1] == 1) currentAliveNeighbours++;
        }
        if (j < board[i].length - 1) {
            if (board[i][j + 1] == 1) currentAliveNeighbours++;
        }
        return currentAliveNeighbours;
    }
}
