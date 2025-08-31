package org.leetcode.topInterview150.easy.happyNumber202;

import java.util.HashSet;

class Solution {

    public static void main(String[] args) {
        boolean happy = new Solution().isHappy(19);
        System.out.println(happy);
    }

    public boolean isHappy(int n) {
        HashSet<Integer> repeated = new HashSet<>();
        repeated.add(n);
        String string = String.valueOf(n);
        while (true) {
            int sum = string.chars().map(s -> s - '0').map(s -> s * s).sum();
            if (sum == 1) {
                return true;
            }
            if (repeated.contains(sum)) {
                return false;
            } else {
                repeated.add(sum);
            }
            string = String.valueOf(sum);
        }
    }

}