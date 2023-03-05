/**
 * https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/
 * @author Andrew Jarombek
 * @since 3/5/2023
 */

function cellsInRange(s: string): string[] {
    let c1 = s.charCodeAt(0);
    let c2 = s.charCodeAt(3);

    let r1 = +s.charAt(1);
    let r2 = +s.charAt(4);

    let result = [];

    for (let col = c1; col <= c2; col++) {
        for (let row = r1; row <= r2; row++) {
            result.push(`${String.fromCharCode(col)}${row}`)
        }
    }

    return result;
}