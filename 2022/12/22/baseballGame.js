/**
 * https://leetcode.com/problems/baseball-game/
 * @author Andrew Jarombek
 * @since 12/22/2022
 */

const calPoints = function(operations) {
    let result = [];

    for (let i = 0; i < operations.length; i++) {
        let operation = operations[i];
        if (operation === '+') {
            result.push(result[result.length - 1] + result[result.length - 2]);
        } else if (operation === 'D') {
            result.push(result[result.length - 1] * 2);
        } else if (operation === 'C') {
            result.pop();
        } else {
            result.push(+operation);
        }
    }

    return result.reduce((acc, val) => acc + val, 0);
};

console.assert(calPoints(["5","2","C","D","+"]) === 30);
console.assert(calPoints(["5","-2","4","C","D","9","+","+"]) === 27);
console.assert(calPoints(["1","C"]) === 0);
