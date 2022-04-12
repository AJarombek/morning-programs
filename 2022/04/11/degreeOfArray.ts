/**
 * https://leetcode.com/problems/degree-of-an-array/
 * @author Andrew Jarombek
 * @since 4/11/2022
 */

function findShortestSubArray(nums: number[]): number {
    let degree = 0;
    const degreeMap = new Map<number, number>();

    for (let num of nums) {
        let count = degreeMap.get(num);
        let value = (count ?? 0) + 1;
        degreeMap.set(num, value);
        degree = Math.max(degree, value);
    }

    let result = nums.length;

    for (let [key, value] of degreeMap.entries()) {
        if (value == degree) {
            let count = 0;
            let length = 0;
            let index = 0;

            while (count < degree) {
                if (nums[index] == key) {
                    count++;
                }

                if (count > 0) {
                    length++;
                }

                index++;
            }

            result = Math.min(result, length);
        }
    }

    return result;
}