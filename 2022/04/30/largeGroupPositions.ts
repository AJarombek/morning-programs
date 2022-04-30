/**
 * https://leetcode.com/problems/positions-of-large-groups/
 * @author Andrew Jarombek
 * @since 4/30/2022
 */

function largeGroupPositions(s: string): number[][] {
    const result = [];
    let prev = "";
    let length = 0;

    for (let i = 0; i < s.length; i++) {
        let char = s.charAt(i);

        if (char == prev) {
            length++;
        } else {
            if (length >= 3) {
                result.push([i - length, i - 1]);
            }

            prev = char;
            length = 1;
        }
    }

    if (length >= 3) {
        result.push([s.length - length, s.length - 1]);
    }

    return result;
}