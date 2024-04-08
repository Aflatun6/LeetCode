package org.leetcode.topInterview150.medium.integerToRoman12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Solution {

    public static void main(String[] args) {
//        String s = new Solution().intToRoman(5);
//        String s = new Solution().intToRoman(3);
//        String s = new Solution().intToRoman(58);
//        String s = new Solution().intToRoman(500);
//        String s = new Solution().intToRoman(1994);
//        String s = new Solution().intToRoman(3);
//        String s = new Solution().intToRoman(4);
        String s = new Solution().intToRoman(11);
        System.out.println(s);
    }

    public String intToRoman(int num) {
        final int NUMBER = num;
        int[] order = new int[]{1, 5, 10, 50, 100, 500, 1000};
        int len = order.length;
        Map<Integer, Character> map = init();
        Optional<Character> original = Arrays.stream(order).filter(i -> i == NUMBER).mapToObj(map::get)
                .findFirst();
        if (original.isPresent()) {
            return original.get().toString();
        }

        StringBuilder result = new StringBuilder();
        int i = len - 2;
        Integer prev = null;
        Integer current = null;
        Integer next = null;
        while (num > 0) {
            if (num >= order[len - 1]) {
                result.append(map.get(order[len - 1]));
                num -= order[len - 1];
                continue;
            }
            next = order[i + 1];
            current = order[i];
            if (i - 1 >= 0) {
                prev = order[i - 1];
            }
            int remainder = num % prev;
            if (num - remainder == current) {
                result.append(map.get(current));
                num = remainder;
                continue;
            }
            if (num - remainder == next - prev) {
                result.append(map.get(prev)).append(map.get(next));
                num = remainder;
                continue;
            }
            if (num - remainder == current - prev){
                result.append(map.get(prev)).append(map.get(current));
                num = remainder;
                continue;
            }
            if (num == prev) {
                result.append(map.get(prev));
                num = remainder;
                continue;
            }
            if (num > current){
                result.append(map.get(current));
                num-= current;
                continue;
            }
            if (num > prev){
                result.append(map.get(prev));
                num-= prev;
                continue;
            }
            i-=2;
        }

        return result.toString();
    }

    private Map<Integer, Character> init() {
        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'I');
        map.put(5, 'V');
        map.put(10, 'X');
        map.put(50, 'L');
        map.put(100, 'C');
        map.put(500, 'D');
        map.put(1000, 'M');
        return map;
    }
}