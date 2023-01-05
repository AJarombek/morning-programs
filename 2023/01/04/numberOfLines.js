/**
 * https://leetcode.com/problems/number-of-lines-to-write-string/
 * @author Andrew Jarombek
 * @since 1/4/2023
 */

const numberOfLines = function(widths, s) {
    let line = 1;
    let width = 0;

    for (let c of s) {
        if (width === 100) {
            width = 0;
            line++;
        }

        const charWidth = widths[c.charCodeAt(0) - 97];

        if (width + charWidth > 100) {
            line++;
            width = charWidth;
        } else {
            width += charWidth;
        }
    }

    return [line, width];
}
