/**
 * https://leetcode.com/problems/baseball-game/
 * @author Andrew Jarombek
 * @since 4/9/2022
 */

function game(ops: string[]): number {
    let result = [];

    for (let op of ops) {
        if (op == "C") {
            result.pop();
        } else if (op == "D") {
            result.push(result[result.length - 1] * 2);
        } else if (op == "+") {
            result.push(result[result.length - 1] + result[result.length - 2]);
        } else {
            result.push(+op);
        }
    }

    return result.reduce((acc, val) => acc + val);
}
