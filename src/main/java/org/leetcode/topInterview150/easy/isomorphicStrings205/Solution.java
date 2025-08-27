package org.leetcode.topInterview150.easy.isomorphicStrings205;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {

    public boolean isIsomorphic(String s, String t) {

        Map<Character, List<Integer>> sList = IntStream.range(0, s.length()).boxed().collect(Collectors.groupingBy(s::charAt));
        Map<Character, List<Integer>> tList = IntStream.range(0, t.length()).boxed().collect(Collectors.groupingBy(t::charAt));

        Set<List<Integer>> ss = new HashSet<>(sList.values());
        Set<List<Integer>> tt = new HashSet<>(tList.values());
        return ss.size() == tt.size() && ss.containsAll(tt);
    }
}