/**
 * https://leetcode.com/problems/binary-search/
 * @author Andrew Jarombek
 * @since 12/31/2022
 */

const search = function(nums, target) {
    let min = 0;
    let max = nums.length - 1;

    while (min <= max) {
        const mid = Math.floor((max + min) / 2);
        const num = nums[mid];
        if (num === target) {
            return mid;
        }

        if (num < target) {
            min = mid + 1;
        } else {
            max = mid - 1;
        }
    }

    return -1;
}

console.assert(search([-1,0,3,5,9,12], 9) === 4);
console.assert(search([-1,0,3,5,9,12], 2) === -1);
