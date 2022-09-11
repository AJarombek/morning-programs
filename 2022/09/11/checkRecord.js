/**
 * https://leetcode.com/problems/student-attendance-record-i/
 * @author Andrew Jarombek
 * @since 9/11/2022
 */

const checkRecord = function(s) {
    let absent = 0;
    let lateStreak = 0;

    for (let c of s) {
        if (c === 'L') {
            lateStreak++;

            if (lateStreak === 3)
                return false;
        } else {
            lateStreak = 0;

            if (c === 'A') {
                absent++;

                if (absent === 2)
                    return false;
            }
        }
    }

    return true;
}

console.assert(checkRecord("PPALLP"));
console.assert(!checkRecord("PPALLL"));
