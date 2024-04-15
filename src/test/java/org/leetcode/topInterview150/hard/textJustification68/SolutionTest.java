package org.leetcode.topInterview150.hard.textJustification68;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void fullJustify() {
        Solution solution = new Solution();
        List<String> result = solution.fullJustify(
                new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16);
        assertEquals(result, List.of(
                "This    is    an",
                "example  of text",
                "justification.  "));
    }

    @Test
    public void fullJustify2() {
        Solution solution = new Solution();
        List<String> result = solution.fullJustify(
                new String[]{"What", "must", "be", "acknowledgment", "shall", "be"}, 16);
        assertEquals(result, List.of(
                "What   must   be",
                "acknowledgment  ",
                "shall be        "));
    }

    @Test
    public void fullJustify3() {
        Solution solution = new Solution();
        List<String> result = solution.fullJustify(new String[]{
                "Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a",
                "computer.", "Art", "is", "everything", "else", "we", "do"}, 20);
        assertEquals(result, List.of(
                "Science  is  what we",
                "understand      well",
                "enough to explain to",
                "a  computer.  Art is",
                "everything  else  we",
                "do                  "));
    }

    @Test
    public void fullJustify4() {
        Solution solution = new Solution();
        List<String> result = solution.fullJustify(new String[]{
                "ask", "not", "what", "your", "country", "can", "do", "for",
                "you", "ask", "what", "you", "can", "do", "for", "your", "country"}, 16);
        assertEquals(result, List.of(
                "ask   not   what",
                "your country can",
                "do  for  you ask",
                "what  you can do",
                "for your country"));
    }

}