package org.leetcode.topInterview150.hard.minimumWindowSubstring76;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {

    public static void main(String[] args) {
        String result = new Solution().minWindow2("ADOBECODEBANC", "ABC");
//        String result = new Solution().minWindow2("aa", "aa");
//        String result = new Solution().minWindow2("acbbaca", "aba");
//        String result = new Solution().minWindow2("ab", "a");
//        String result = new Solution().minWindow2("ab", "b");
//        String result = new Solution().minWindow2("abc", "b");
        System.out.println(result);

    }

    public String minWindow2(String s, String t) {
        String theSubstring = "";
        if (t.length() > s.length()) {
            return theSubstring;
        }
        boolean atLeastOnceUpdated = false;

        int[] mapT = new int[128];
        t.chars().forEach(c -> mapT[c]++);
        int[] mapS = new int[128];
        s.chars().forEach(c -> mapS[c]++);
        boolean atLeastOneMatch = false;
        int[] mapSS = Arrays.copyOf(mapS, 128);
        boolean leftToRight = true;
        for (int i = 0, j = s.length() - 1; i <= (s.length() - t.length()) || j >= t.length() - 1; ) {
            A:
            if (leftToRight) {
                char currentSChar = s.charAt(i);
                if (!atLeastOneMatch && mapT[currentSChar] > 0 && mapS[currentSChar] > 0) {
                    atLeastOneMatch = true;
                }
                String currentSubstring = s.substring(i);
                i++;
                if ((mapS[currentSChar]-- > mapT[currentSChar])) {
                    if (currentSubstring.length() < theSubstring.length() || !atLeastOnceUpdated) {
                        atLeastOnceUpdated = true;
                        theSubstring = currentSubstring;
                    }
                } else {
                    if (currentSubstring.length() < theSubstring.length() || !atLeastOnceUpdated) {
                        atLeastOnceUpdated = true;
                        theSubstring = currentSubstring;
                    }
                    leftToRight = false;
                }
            }
            if (!leftToRight) {
                char currentSChar = s.charAt(j);
                String currentSubstring = s.substring(i - 1, j + 1);
                j--;
                if ((mapSS[currentSChar]-- > mapT[currentSChar])) {
                    if (currentSubstring.length() < theSubstring.length()) {
                        theSubstring = currentSubstring;
                    }
                } else {
                    if (currentSubstring.length() < theSubstring.length()) {
                        theSubstring = currentSubstring;
                    }
                    break;
                }
            }
        }

        for (int i = s.length() - 1, j = 0; i >= t.length() - 1 || j <= (s.length() - t.length()); ) {
            if (!leftToRight) {
                char currentSChar = s.charAt(i);
                String currentSubstring = s.substring(0, i + 1);
                i--;
                if ((mapSS[currentSChar]-- > mapT[currentSChar])) {
                    if (currentSubstring.length() < theSubstring.length()) {
                        theSubstring = currentSubstring;
                    }
                } else {
                    if (currentSubstring.length() < theSubstring.length()) {
                        theSubstring = currentSubstring;
                    }
                    leftToRight = true;
                }
            }
            if (leftToRight) {
                char currentSChar = s.charAt(j);
                String currentSubstring = s.substring(j, i);
                j++;
                if ((mapS[currentSChar]-- > mapT[currentSChar])) {
                    if (currentSubstring.length() < theSubstring.length()) {
                        theSubstring = currentSubstring;
                    }
                } else {
                    if (currentSubstring.length() < theSubstring.length()) {
                        theSubstring = currentSubstring;
                    }
                    leftToRight = false;
                }
            }
        }

        return atLeastOneMatch ? theSubstring : "";
    }

    public String minWindow(String s, String t) {
        String theSubstring = "";
        boolean atLeastOnceUpdated = false;
        boolean stretch = true;
        for (int i = 0, j = t.length(); j <= s.length(); ) {
            String substring = s.substring(i, j);
            if (sContainsT2(substring, t, stretch)) {
                stretch = false;
                if (!atLeastOnceUpdated || substring.length() <= theSubstring.length()) {
                    atLeastOnceUpdated = true;
                    theSubstring = substring;
                }
            } else {
                stretch = true;
            }
            if (stretch) {
                j++;
            } else {
                i++;
            }
        }
        return theSubstring;
    }

    private boolean sContainsT(String substring, String t) {
        if (t.length() > substring.length()) {
            return false;
        }
        for (Character c : substring.toCharArray()) {
            if (t.indexOf(c) != -1) {
                t = t.substring(0, t.indexOf(c)).concat(t.substring(t.indexOf(c) + 1));
            }
            if (t.length() == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean sContainsT2(String substring, String t, boolean stretch) {
        if (t.length() > substring.length()) {
            return false;
        }
        if (stretch || firstCharOfPrevSubstring == null) {
            firstCharOfPrevSubstring = String.valueOf(substring.charAt(0));
        }
        if (stretch && tempT != null) {
            char lastChar = substring.charAt(substring.length() - 1);
            int i = tempT.indexOf(lastChar);
            if (i != -1) {
                tempT = tempT.substring(0, i).concat(tempT.substring(i + 1));
            }
            return tempT.length() == 0;
        }
        if (!stretch) {
            boolean contains = t.contains(firstCharOfPrevSubstring);
            if (!contains) {
                firstCharOfPrevSubstring = String.valueOf(substring.charAt(0));
                return true;
            } else {
                tempT = tempT.concat(firstCharOfPrevSubstring);
            }
        }
        for (Character c : substring.toCharArray()) {
            if (t.indexOf(c) != -1) {
                t = t.substring(0, t.indexOf(c)).concat(t.substring(t.indexOf(c) + 1));
            }
            if (t.length() == 0) {
                tempT = "";
                return true;
            }
        }
        tempT = t;
        return false;
    }

    private String tempT;
    private String firstCharOfPrevSubstring;
}