/**
 * https://leetcode.com/problems/largest-number-after-digit-swaps-by-parity/
 * @author Andrew Jarombek
 * @since 3/8/2023
 */

function largestInteger(num: number): number {
    const nums = [];

    while (num > 0) {
        nums.push(num % 10);
        num = Math.floor(num / 10);
    }

    nums.reverse()

    for (let i = 0; i < nums.length; i++) {
        const val = nums[i];
        const mod = val % 2;
        let swap = val;
        let index = 0;

        for (let j = i + 1; j < nums.length; j++) {
            const num = nums[j];

            if (num % 2 == mod && num > swap) {
                swap = num;
                index = j;
            }
        }

        if (index) {
            nums[i] = nums[index];
            nums[index] = val;
        }
    }

    return +nums.join("");
}