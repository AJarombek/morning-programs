/**
 * https://leetcode.com/problems/first-bad-version/
 * @author Andrew Jarombek
 * @since 2/25/2022
 */

const isBadVersion = (version: number) => true;

const solution = function(isBadVersion: any) {

    return function(n: number): number {
        let low = 1;
        let high = n;

        while (low < high) {
            const mid = Math.floor((low + high) / 2);
            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    };
};
