/**
 * https://leetcode.com/problems/robot-return-to-origin/
 * @author Andrew Jarombek
 * @since 12/18/2022
 */

const judgeCircle = function(moves) {
    const directions = {
        'U': [0, 1],
        'D': [0, -1],
        'L': [-1, 0],
        'R': [1, 0]
    };

    let location = [0, 0];

    for (let move of moves) {
        location[0] += directions[move][0];
        location[1] += directions[move][1];
    }

    return location[0] === 0 && location[1] === 0;
};

console.assert(judgeCircle("UD"));
console.assert(!judgeCircle("LL"));