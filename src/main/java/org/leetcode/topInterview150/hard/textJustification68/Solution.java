package org.leetcode.topInterview150.hard.textJustification68;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        boolean leftJustified = false;
        int currSum = 0;
        List<String> result = new ArrayList<>();
        for (int i = 0, j = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                leftJustified = true;
            }
            currSum += words[i].length();
            if (currSum < maxWidth) {
                currSum++;
            }
            if (currSum == maxWidth) {
                currSum = 0;
                String[] theLine = new String[i - j + 1];
                for (int k = 0; j <= i; j++, k++) {
                    theLine[k] = words[j];
                }
                j = i + 1;
                handleResult(result, maxWidth, leftJustified, theLine);
                continue;
            }
            if (currSum > maxWidth) {
                currSum = words[i].length() + 1;
                String[] theLine = new String[i - j];
                for (int k = 0; j < i; j++, k++) {
                    theLine[k] = words[j];
                }
                j = i;
                handleResult(result, maxWidth, false, theLine);
            }
            if (currSum > 0 && i == words.length - 1) {
                String[] theLine = new String[i - j + 1];
                for (int k = 0; j <= i; j++, k++) {
                    theLine[k] = words[j];
                }
                j = i;
                handleResult(result, maxWidth, leftJustified, theLine);
            }
        }
        return result;
    }

    private void handleResult(List<String> result, int maxWidth, boolean leftJustified, String... strings) {
        final String SPACE = " ";
        if (strings.length == 1) {
            int len = maxWidth - strings[0].length();
            String s = strings[0];
            for (int i = 0; i < len; i++) {
                s = s.concat(SPACE);
            }
            result.add(s);
        } else {
            String line = "";
            int totalLen = 0;
            for (String s : strings) {
                totalLen += s.length();
            }

            if (leftJustified) {
                int dif = maxWidth - (totalLen + (strings.length - 1));
                for (int i = 0; i < strings.length; i++) {
                    line = line.concat(strings[i]);
                    if (line.length() < maxWidth) {
                        line = line.concat(SPACE);
                        if (i == strings.length - 1) {
                            for (int j = 0; j < dif - 1; j++) {
                                line = line.concat(SPACE);
                            }
                        }
                    }
                }
                result.add(line);
                return;
            }

            int diff = maxWidth - totalLen;
            int minSpacesBetween = diff / (strings.length - 1);
            if (minSpacesBetween * (strings.length - 1) == diff) {
                for (int i = 0; i < strings.length; i++) {
                    line = line.concat(strings[i]);
                    if (i != strings.length - 1) {
                        for (int j = 0; j < minSpacesBetween; j++) {
                            line = line.concat(SPACE);
                        }
                    }
                }
                result.add(line);
            } else {
                int dif = diff - (minSpacesBetween * (strings.length - 1));
                for (int i = 0; i < strings.length; i++) {
                    line = line.concat(strings[i]);
                    if (i != strings.length - 1) {
                        for (int j = 0; j < minSpacesBetween; j++) {
                            line = line.concat(SPACE);
                            if (dif > 0) {
                                line = line.concat(SPACE);
                                dif--;
                            }
                        }
                    }
                }
                result.add(line);
            }
        }
    }
}
