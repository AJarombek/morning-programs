/**
 * https://leetcode.com/problems/next-greater-element-i/
 * @author Andrew Jarombek
 * @since 9/6/2022
 */

const nextGreaterElement = function(nums1, nums2) {
    const map = new Map();

    for (let i = 0; i < nums2.length; i++) {
        const val = nums2[i];

        let found = false;
        let index = i + 1;

        while (!found && index < nums2.length) {
            if (nums2[index] > val) {
                found = true;
            } else {
                index++;
            }
        }

        map.set(val, found ? nums2[index] : -1);
    }

    return nums1.map((val) => map.get(val));
}

let result = nextGreaterElement([4,1,2], [1,3,4,2]);
let expected = [-1,3,-1]
console.assert(expected.every((value, index) => value === result[index]));

result = nextGreaterElement([2,4], [1,2,3,4]);
expected = [3,-1];
console.assert(expected.every((value, index) => value === result[index]));
