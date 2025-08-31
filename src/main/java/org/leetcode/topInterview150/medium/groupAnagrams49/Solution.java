package org.leetcode.topInterview150.medium.groupAnagrams49;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {

    public static void main(String[] args) {
//        List<List<String>> result = new Solution().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
//        List<List<String>> result = new Solution().groupAnagrams(new String[]{"a"});
        List<List<String>> result = new Solution().groupAnagrams(new String[]{""});
        result.forEach(System.out::println);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        int misses = 0;
        if (strs.length == 1){
            result.add(Arrays.asList(strs));
        }
        for (int i = 0, k = i, j = i + 1; i < strs.length && j < strs.length; j++) {
            if (isAnagram(strs[i], strs[j])) {
                var tmp = strs[k + 1];
                strs[k + 1] = strs[j];
                strs[j] = tmp;
                k = j - misses;
            } else {
                misses++;
            }
            if (j == strs.length - 1) {
                List<String> anagrams = IntStream.rangeClosed(i, k).mapToObj(ii -> strs[ii]).collect(Collectors.toList());
                result.add(anagrams);
                i = k + 1;
                k = i;
                j = i;
                if (i == strs.length - 1 && misses > 0) {
                    result.add(Collections.singletonList(strs[i]));
                }
                misses = 0;
            }
        }

        return result;
    }


    private boolean isAnagram(String s, String t) {
        Map<Character, Long> sList = getMap(s);
        Map<Character, Long> tList = getMap(t);
        return sList.equals(tList);
    }

    private Map<Character, Long> getMap(String s) {
        return s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}