/**
 * https://leetcode.com/problems/intersection-of-two-arrays/
 * @author Andrew Jarombek
 * @since 3/1/2022
 */

function intersection(nums1: number[], nums2: number[]): number[] {
    const set1 = new Set<number>(nums1);
    const set2 = new Set<number>(nums2);

    const result = [];

    for (let num of set1) {
        if (set2.has(num)) {
            result.push(num);
        }
    }

    return result;
}