/**
 * https://leetcode.com/problems/di-string-match
 * @author Andrew Jarombek
 * @since 5/27/2022
 */

function diStringMatch(s: string): number[] {
    const result = [];
    let low = 0;
    let high = s.length;

    for (let c of s) {
        if (c == 'I') {
            result.push(low);
            low++;
        } else {
            result.push(high);
            high--;
        }
    }

    result.push(low);
    return result;
}
