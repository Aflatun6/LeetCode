package org.leetcode.topInterview150.easy.romanToInteger13;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int romanToInt2(String s) {
        Map<Character, Integer> map = init();
        int sum = 0;
        Integer prev = null;
        int current;
        for (int i = 0; i < s.length(); i++) {
            if (i - 1 >= 0) {
                prev = map.get(s.charAt(i - 1));
            }
            current = map.get(s.charAt(i));
            if (prev != null &&
                    (prev == 1 && (current == 5 || current == 10)
                            || prev == 10 && (current == 50 || current == 100)
                            || prev == 100 && (current == 500 || current == 1000))) {
                sum += current;
                sum -= 2 * prev;
            } else {
                sum += current;
            }
        }
        return sum;
    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = init();
        int sum = 0;
        Integer prev = null;
        int current;
        for (int i = 0; i < s.length(); i++) {
            if (i - 1 >= 0) {
                prev = map.get(s.charAt(i - 1));
            }
            current = map.get(s.charAt(i));
            if (prev != null && prev < current) {
                sum += current;
                sum -= 2 * prev;
            } else {
                sum += current;
            }
        }
        return sum;
    }

    private Map<Character, Integer> init() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }
}