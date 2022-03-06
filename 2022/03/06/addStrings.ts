/**
 * https://leetcode.com/problems/add-strings/
 * @author Andrew Jarombek
 * @since 3/6/2022
 */

function addStrings(num1: string, num2: string): string {
    let index1 = num1.length - 1;
    let index2 = num2.length - 1;

    const result = [];
    let remainder = 0;

    while (index1 >= 0 || index2 >= 0) {
        const val1 = index1 >= 0 ? +num1.charAt(index1) : 0;
        const val2 = index2 >= 0 ? +num2.charAt(index2) : 0;
        const val = remainder + val1 + val2;

        result.push(`${val % 10}`);
        remainder = Math.floor(val / 10);

        index1--;
        index2--;
    }

    if (remainder == 1) {
        result.push("1");
    }

    return result.reverse().join("");
}