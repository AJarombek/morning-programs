/**
 * https://leetcode.com/problems/third-maximum-number/
 * @author Andrew Jarombek
 * @since 3/5/2022
 */

function thirdMax(nums: number[]): number {
    let values = [null, null, null];

    for (let num of nums) {
        for (let i = 0; i < 3; i++) {
            const val = values[i];
            if (val == null || val == num) {
                values[i] = num;
                break;
            } else if (num > val) {
                let next = num;

                for (let j = i; j < 3; j++) {
                    let temp = values[j];
                    values[j] = next;
                    next = temp;
                }

                break;
            }
        }
    }

    return values[2] == null ? values[0] : values[2];
}