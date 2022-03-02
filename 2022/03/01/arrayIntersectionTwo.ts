/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * @author Andrew Jarombek
 * @since 3/1/2022
 */

function intersect(nums1: number[], nums2: number[]): number[] {
    nums1.sort((a, b) => a - b);
    nums2.sort((a, b) => a - b);
    const result = [];

    let index1 = 0;
    let index2 = 0;

    while (index1 < nums1.length && index2 < nums2.length) {
        const value1 = nums1[index1];
        const value2 = nums2[index2];

        if (value1 == value2) {
            result.push(nums1[index1]);
            index1++;
            index2++;
        } else if (value1 > value2) {
            index2++;
        } else {
            index1++;
        }
    }

    return result;
}