/**
 * https://leetcode.com/problems/max-consecutive-ones/
 * @author Andrew Jarombek
 * @since 9/6/2022
 */

const findMaxConsecutiveOnes = function(nums) {
    let result = 0;
    let current = 0;

    for (let num of nums) {
        current = num ? current + 1 : 0;
        result = Math.max(result, current);
    }

    return result;
};

let result = findMaxConsecutiveOnes([1,1,0,1,1,1]);
console.assert(result === 3);

result = findMaxConsecutiveOnes([1,0,1,1,0,1]);
console.assert(result === 2);

result = findMaxConsecutiveOnes([1,0,1,0,0,1]);
console.assert(result === 1);
