package org.leetcode.topInterview150.easy.wordPattern290;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().wordPattern("abba", "dog cat cat dog"));
//        System.out.println(new Solution().wordPattern("aaaa", "dog cat cat dog"));
//        System.out.println(new Solution().wordPattern("abc", "dog cat dog"));
    }

    public boolean wordPattern(String pattern, String s) {
        String[] sWords = s.split(" ");
        if (sWords.length != pattern.length()) {
            return false;
        }
        Map<Character, List<Integer>> pMap = IntStream.range(0, pattern.length())
                .boxed() // Convert IntStream to Stream<Integer>
                .collect(Collectors.groupingBy(pattern::charAt, Collectors.toList()));

        Iterator<Map.Entry<Character, List<Integer>>> iterator = pMap.entrySet().iterator();
        String value = null;
        while (iterator.hasNext()) {
            List<Integer> indexes = iterator.next().getValue();
            value = sWords[indexes.get(0)];
            for (int i = 0; i < pattern.length(); i++) {
                if (value.equals(sWords[i]) && !indexes.contains(i)){
                    return false;
                }
                if (!value.equals(sWords[i]) && indexes.contains(i)) {
                    return false;
                }
            }
        }

        return true;
    }
}