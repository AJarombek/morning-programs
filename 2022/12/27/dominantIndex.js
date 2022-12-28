/**
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others/
 * @author Andrew Jarombek
 * @since 12/27/2022
 */

const dominantIndex = function(nums) {
    const values = [nums[0], -1];
    let index = 0;

    for (let i = 1; i < nums.length; i++) {
        const num = nums[i];

        if (num > values[0]) {
            values[1] = values[0];
            values[0] = num;
            index = i;
        } else if (num > values[1]) {
            values[1] = num;
        }
    }

    return (values[0] >= (values[1] * 2)) ? index : -1;
}

console.assert(dominantIndex([3,6,1,0]) === 1);
console.assert(dominantIndex([1,2,3,4]) === -1);
