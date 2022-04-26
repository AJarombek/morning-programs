/**
 * https://leetcode.com/problems/rotate-string/
 * @author Andrew Jarombek
 * @since 4/25/2022
 */

function rotateString(s: string, goal: string): boolean {
    if (s.length > goal.length)
        return false;

    let str = s + s;

    for (let i = 0; i <= str.length - goal.length; i++) {
        let index = 0;
        let matches = true;

        while (matches && index < goal.length) {
            if (goal[index] != str[index + i]) {
                matches = false;
            }

            index++;
        }

        if (matches)
            return true;
    }

    return false;
}