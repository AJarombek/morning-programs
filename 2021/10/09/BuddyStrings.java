/**
 * https://leetcode.com/problems/buddy-strings/
 * @author Andrew Jarombek
 * @since 10/9/2021
 */

import java.util.HashSet;
import java.util.Set;

public class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            Set<Character> set = new HashSet<>();

            for (int i = 0; i < s.length(); i++) {
                if (set.contains(s.charAt(i))) {
                    return true;
                }

                set.add(s.charAt(i));
            }

            return false;
        } else {
            Character firstMismatchSource = null;
            Character firstMismatchGoal = null;
            boolean swappable = false;

            for (int i = 0; i < s.length(); i++) {
                char sourceChar = s.charAt(i);
                char goalChar = goal.charAt(i);

                if (sourceChar != goalChar) {
                    if (swappable) {
                        return false;
                    } else if (firstMismatchSource != null) {
                        if (firstMismatchSource == goalChar && firstMismatchGoal == sourceChar) {
                            swappable = true;
                        } else {
                            return false;
                        }
                    } else {
                        firstMismatchSource = sourceChar;
                        firstMismatchGoal = goalChar;
                    }
                }
            }

            return !(firstMismatchGoal != null && !swappable);
        }
    }
}
