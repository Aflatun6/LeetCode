package org.leetcode.topInterview150.easy.palindromeNumber9;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(2147483647));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        int temp = x;
        while (temp > 0) {
            int y = temp % 10;
            temp = temp / 10;
            list.add(y);
        }
        int degree = list.size() - 1;
        long sum = 0;
        for (int i : list) {
            sum += (long) (i * Math.pow(10, degree));
            degree--;
        }

        return sum == x;
    }
}