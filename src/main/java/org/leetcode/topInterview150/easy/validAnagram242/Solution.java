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
        Map<Character, Long> sList = getMap(s);
        Map<Character, Long> tList = getMap(t);
        return sList.equals(tList);
    }

    private Map<Character, Long> getMap(String s){
        return s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}