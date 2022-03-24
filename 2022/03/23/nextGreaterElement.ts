/**
 * https://leetcode.com/problems/next-greater-element-i/
 * @author Andrew Jarombek
 * @since 3/23/2022
 */

function nextGreaterElement(nums1: number[], nums2: number[]): number[] {
    let numMap = new Map<number, number>();

    for (let i = 0; i < nums2.length; i++) {
        numMap.set(nums2[i], i);
    }

    let result = [];

    for (let i = 0; i < nums1.length; i++) {
        let num = nums1[i];

        let index = numMap.get(num) + 1;
        let next = -1;

        while (index < nums2.length && next == -1) {
            let val = nums2[index];
            if (val > num) {
                next = val;
            }

            index++;
        }

        result.push(next);
    }

    return result;
}