/**
 * https://leetcode.com/problems/fizz-buzz/
 * @author Andrew Jarombek
 * @since 3/5/2022
 */

function fizzBuzz(n: number): string[] {
    const result = [];

    for (let i = 1; i <= n; i++) {
        let value = "";

        if (i % 3 == 0) {
            value = "Fizz";
        }

        if (i % 5 == 0) {
            value += "Buzz";
        }

        if (!value) {
            value = `${i}`;
        }

        result.push(value);
    }

    return result;
}