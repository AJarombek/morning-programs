/**
 * https://leetcode.com/problems/student-attendance-record-i/
 * @author Andrew Jarombek
 * @since 3/28/2022
 */

function checkRecord(s: string): boolean {
    let absent = 0;
    let lateStreak = 0;

    for (let c of s) {
        if (c == 'A') {
            if (absent == 1)
                return false;

            absent++;
            lateStreak = 0;
        } else if (c == 'L') {
            if (lateStreak == 2)
                return false;

            lateStreak++;
        } else {
            lateStreak = 0;
        }
    }

    return true;
}