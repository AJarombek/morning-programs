/**
 * https://leetcode.com/problems/sort-even-and-odd-indices-independently/
 * @author Andrew Jarombek
 * @since 3/3/2023
 */

function sortEvenOdd(nums: number[]): number[] {
    let evens = nums.filter((_, index) => index % 2 == 0);
    let odds = nums.filter((_, index) => index % 2 == 1);

    evens.sort((x, y) => x - y);
    odds.sort((x, y) => y - x);

    let result = [];

    for (let i = 0; i < odds.length; i++) {
        result.push(evens[i]);
        result.push(odds[i]);
    }

    if (evens.length > odds.length) {
        result.push(evens[evens.length - 1]);
    }

    return result;
}
