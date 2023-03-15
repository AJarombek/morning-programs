/**
 * https://leetcode.com/problems/count-asterisks/
 * @author Andrew Jarombek
 * @since 3/14/2023
 */

function countAsterisks(s: string): number {
    const pairs = s.split("|");

    return pairs.reduce((acc, value, index) => {
        if (index % 2 == 0) {
            let inc = 0;

            for (let c of value) {
                if (c == '*') {
                    inc++;
                }
            }

            return acc + inc;
        }

        return acc;
    }, 0);
}
