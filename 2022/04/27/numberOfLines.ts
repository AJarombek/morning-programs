/**
 * https://leetcode.com/problems/number-of-lines-to-write-string/
 * @author Andrew Jarombek
 * @since 4/27/2022
 */

function numberOfLines(widths: number[], s: string): number[] {
    let lines = 1;
    let width = 0;
    let offset = "a".charCodeAt(0);

    for (let c of s) {
        let val = widths[c.charCodeAt(0) - offset];
        width += val;

        if (width > 100) {
            width = val;
            lines++;
        }
    }

    return [lines, width];
}