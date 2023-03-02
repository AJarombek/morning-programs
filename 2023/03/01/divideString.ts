/**
 * https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/
 * @author Andrew Jarombek
 * @since 3/1/2023
 */

function divideString(s: string, k: number, fill: string): string[] {
    let result = [];

    for (let i = 0; i < s.length; i += k) {
        result.push(s.substring(i, i + k));
    }

    if (s.length % k == 0) {
        return result;
    }

    let finalResult = [result[result.length - 1]];

    for (let i = s.length % k; i < k; i++) {
        finalResult.push(fill);
    }

    result[result.length - 1] = finalResult.join("");

    return result;
}