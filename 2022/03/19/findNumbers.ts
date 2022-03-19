/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 * @author Andrew Jarombek
 * @since 3/19/2022
 */

function findDisappearedNumbers(nums: number[]): number[] {
    let numbers = new Set<number>();

    for (let i = 1; i <= nums.length; i++)
        numbers.add(i);

    for (let num of nums) {
        numbers.delete(num);
    }

    return Array.from(numbers);
}