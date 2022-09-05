/**
 * https://leetcode.com/problems/license-key-formatting/
 * @author Andrew Jarombek
 * @since 9/5/2022
 */

const licenseKeyFormatting = function(s, k) {
    const chars = [];

    for (let c of s) {
        if (c !== "-") {
            chars.push(c.toUpperCase());
        }
    }

    const result = [];
    let index = 0;

    while (index < chars.length % k) {
        result.push(chars[index]);
        index++;
    }

    while (index < chars.length) {
        if (index > 0)
            result.push("-");

        for (let i = 0; i < k; i++) {
            result.push(chars[index]);
            index++;
        }
    }

    return result.join("");
};

let result = licenseKeyFormatting("5F3Z-2e-9-w", 4);
console.assert(result === "5F3Z-2E9W");
