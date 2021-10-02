/**
 * https://leetcode.com/problems/rotate-string/
 * @author Andrew Jarombek
 * @since 10/2/2021
 */

public class RotateString {
    public boolean rotateString(String s, String goal) {
        String str = s + s;
        return s.length() == goal.length() && str.contains(goal);
    }
}
