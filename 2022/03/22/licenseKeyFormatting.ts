/**
 * https://leetcode.com/problems/license-key-formatting/
 * @author Andrew Jarombek
 * @since 3/22/2022
 */

function licenseKeyFormatting(s: string, k: number): string {
    let size = 0;

    for (let c of s) {
        if (c != '-') {
            size++;
        }
    }

    let i = (k - (size % k)) % k;
    let result = [];

    for (let c of s) {
        if (c != '-') {
            if (i % k == 0 && i != 0) {
                result.push('-');
            }

            result.push(c.toUpperCase());
            i++;
        }
    }

    return result.join("");
}
