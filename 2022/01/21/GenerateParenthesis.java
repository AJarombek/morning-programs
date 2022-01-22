/**
 * https://leetcode.com/problems/generate-parentheses/
 * @author Andrew Jarombek
 * @since 1/21/2022
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    public static void backtrack(List<String> result, String s, int left, int right, int n) {
        if (left + right == n * 2) {
            result.add(s);
        }

        if (left < n) {
            backtrack(result, s + "(", left + 1, right, n);
        }

        if (left > right) {
            backtrack(result, s + ")", left, right + 1, n);
        }
    }

    public List<String> generateParenthesisSlow(int n) {
        Set<String> set = new HashSet<>();
        set.add("()");

        int cycle = 2;
        while (cycle <= n) {
            Set<String> newSet = new HashSet<>();

            for (String s : set) {
                for (int i = 0; i < s.length(); i++) {
                    newSet.add(s.substring(0, i) + "()" + s.substring(i));
                }
            }

            set = newSet;
            cycle++;
        }

        return new ArrayList<>(set);
    }
}
