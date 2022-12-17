/**
 * https://leetcode.com/problems/set-mismatch/
 * @author Andrew Jarombek
 * @since 12/17/2022
 */

const findErrorNums = function(nums) {
    const set = new Set();

    for (let i = 1; i <= nums.length; i++)
        set.add(i);

    let duplicate = 0;

    for (let num of nums) {
        if (!set.has(num)) {
            duplicate = num;
        } else {
            set.delete(num);
        }
    }

    return [duplicate, set.keys().next().value];
}

let result = findErrorNums([1, 2, 2, 4]);
let expected = [2, 3];

console.assert(expected.every((value, index) => value === result[index]));

result = findErrorNums([1, 1]);
expected = [1, 2];

console.assert(expected.every((value, index) => value === result[index]));
