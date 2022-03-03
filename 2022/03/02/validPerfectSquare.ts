/**
 * https://leetcode.com/problems/valid-perfect-square/
 * @author Andrew Jarombek
 * @since 3/2/2022
 */

function isPerfectSquare(num: number): boolean {
    if (num == 1)
        return true;

    let low = 0;
    let high = num >> 1;

    while (low <= high) {
        let mid = Math.round((low + high) / 2);
        const val = mid * mid;

        if (val == num) {
            return true;
        } else if (val > num) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return false;
}