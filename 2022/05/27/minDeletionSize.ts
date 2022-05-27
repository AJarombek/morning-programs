/**
 * https://leetcode.com/problems/delete-columns-to-make-sorted/
 * @author Andrew Jarombek
 * @since 5/27/2022
 */

function minDeletionSize(strs: string[]): number {
    let count = 0;

    for (let i = 0; i < strs[0].length; i++) {
        let prev = '@';

        for (let str of strs) {
            const c = str.charAt(i);

            if (c < prev) {
                count++;
                break;
            } else {
                prev = c;
            }
        }
    }

    return count;
}