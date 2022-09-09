/**
 * https://leetcode.com/problems/base-7/
 * @author Andrew Jarombek
 * @since 9/8/2022
 */

const convertToBase7 = function(num) {
    if (num === 0)
        return "0";

    let result = [];
    let negative = num < 0;
    num = Math.abs(num);

    while (num > 0) {
        result.push(num % 7);
        num = Math.floor(num / 7);
    }

    if (negative)
        result.push("-");

    for (let i = 0; i < Math.floor(result.length / 2); i++) {
        const temp = result[i];
        result[i] = result[result.length - 1 - i];
        result[result.length - 1 - i] = temp;
    }

    return result.join("");
};

let result = convertToBase7("100");
console.assert(result === "202");

result = convertToBase7("-7");
console.assert(result === "-10");
