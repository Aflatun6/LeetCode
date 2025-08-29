package org.leetcode.topInterview150.easy.validAnagram242;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        Map<Character, Long> sList = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Long> tList = t.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return sList.equals(tList);
    }
}