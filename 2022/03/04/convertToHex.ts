/**
 * https://leetcode.com/problems/convert-a-number-to-hexadecimal/
 * @author Andrew Jarombek
 * @since 3/4/2022
 */

function toHex(num: number): string {
    if (num == 0) {
        return "0";
    }

    if (num < 0) {
        num = 2 ** 32 + num;
    }

    const hex = {[10]: 'a', [11]: 'b', [12]: 'c', [13]: 'd', [14]: 'e', [15]: 'f'};
    let result = [];

    while (num > 0) {
        const val = num % 16;

        result.push(val > 9 ? hex[val] : `${val}`);

        num = Math.floor(num / 16);
    }

    return result.reverse().join("");
}