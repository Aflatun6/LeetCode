package org.leetcode.topInterview150.medium.simplifyPath71;

import java.util.*;
import java.util.stream.Collectors;

class Solution {

    public static void main(String[] args) {
//        System.out.println(new Solution().simplifyPath("/.../a/../b/c//../d/.///"));
//        System.out.println(new Solution().simplifyPath("/home/user/Documents/../Pictures"));
//        System.out.println(new Solution().simplifyPath("/../"));
        System.out.println(new Solution().simplifyPath("/home/user/Documents/../../////Pictures/////../../../."));
    }

    public String simplifyPath(String path) {
        String currentDir = ".";
        String parentDir = "..";
        String root = "/";


        String[] split = path.split(root);
        List<String> collect = Arrays.stream(split).filter(s -> !s.isEmpty()).map(s -> {
            if (s.startsWith(" ")) {
                s = s.substring(1);
            }
            return s;
        }).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        sb.append(root);
        Stack<Integer> lastCharSize = new Stack<>();
        boolean finalSlash = false;
        boolean finalSkipped = false;
        for (int i = 0; i < collect.size(); i++) {
            String currentChar = collect.get(i);
            if (currentChar.equals(parentDir)) {
                int length = sb.length();
                int pop = lastCharSize.isEmpty() ? 0 : lastCharSize.pop();
                pop = sb.length() == 1 ? -1 : pop;
                sb.delete(length - pop - 1, length);
                if (i == collect.size() - 1) {
                    finalSkipped = true;
                }
                continue;
            }
            if (currentChar.equals(currentDir)) {
                if (i == collect.size() - 1) {
                    finalSkipped = true;
                }
                continue;
            }
            sb.append(currentChar);
            if (i < collect.size() - 1) {
                sb.append('/');
                finalSlash = true;
            }
            lastCharSize.push(currentChar.length());
        }
        if (finalSlash && finalSkipped) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.length() == 0 ? root : sb.toString();
    }
}