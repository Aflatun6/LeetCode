package org.leetcode.topInterview150.easy.ransomNote383;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.isEmpty()) {
            return true;
        }
        Map<Character, Long> rn = ransomNote.chars()
                .mapToObj(c -> (char) c) // Convert int to Character
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (int i = 0; i < magazine.length(); i++) {
            char currentMag = magazine.charAt(i);
            if (rn.containsKey(currentMag)) {
                rn.put(currentMag, rn.get(currentMag) - 1);
                if (rn.get(currentMag) == 0) {
                    rn.remove(currentMag);
                }
            }
            if (rn.isEmpty()) {
                return true;
            }
        }

        return false;
    }
}