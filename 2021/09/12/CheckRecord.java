/**
 * https://leetcode.com/problems/student-attendance-record-i/
 * @author Andrew Jarombek
 * @since 9/12/2021
 */

public class CheckRecord {
    public boolean checkRecord(String s) {
        int absentCount = 0;
        int lateCount = 0;
        boolean lateStreak = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'A') {
                absentCount++;
                lateCount = 0;

                if (absentCount == 2) {
                    return false;
                }
            } else if (c == 'L') {
                lateCount++;

                if (lateCount == 3) {
                    return false;
                }
            } else {
                lateCount = 0;
            }
        }

        return true;
    }
}
