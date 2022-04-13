/**
 * https://leetcode.com/problems/self-dividing-numbers/
 * @author Andrew Jarombek
 * @since 4/13/2022
 */

function selfDividingNumbers(left: number, right: number): number[] {
    const result = [];

    for (let i = left; i <= right; i++) {
        let isSelfDividing = true;
        let num = i;

        while (num > 0 && isSelfDividing) {
            if (i % (num % 10) != 0) {
                isSelfDividing = false;
            } else {
                num = Math.floor(num / 10);
            }
        }

        if (isSelfDividing)
            result.push(i);
    }

    return result;
}