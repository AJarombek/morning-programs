/**
 * https://leetcode.com/problems/largest-perimeter-triangle/
 * @author Andrew Jarombek
 * @since 5/29/2022
 */

function largestPerimeter(nums: number[]): number {
    nums.sort((x, y) => y - x);

    let index = 0;
    while (index <= nums.length - 3) {
        let x = nums[index];
        let y = nums[index + 1];
        let z = nums[index + 2];

        if (z + y > x) {
            return x + y + z;
        }

        index++;
    }

    return 0;
}