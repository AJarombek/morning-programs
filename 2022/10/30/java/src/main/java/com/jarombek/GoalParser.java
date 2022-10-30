/*
 * https://leetcode.com/problems/goal-parser-interpretation/
 * @author Andrew Jarombek
 * @since 10/30/2022
 */

package com.jarombek;

class GoalParser {
    public static String interpret(String command) {
        int i = 0;
        StringBuilder sb = new StringBuilder();

        while (i < command.length()) {
            char c = command.charAt(i);

            if (c == 'G') {
                sb.append(c);
                i++;
            } else {
                if (command.charAt(i + 1) == ')') {
                    sb.append("o");
                    i += 2;
                } else {
                    sb.append("al");
                    i += 4;
                }
            }
        }

        return sb.toString();
    }
}
