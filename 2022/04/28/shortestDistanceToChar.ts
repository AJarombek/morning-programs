/**
 * https://leetcode.com/problems/shortest-distance-to-a-character/
 * @author Andrew Jarombek
 * @since 4/28/2022
 */

function shortestToChar(s: string, c: string): number[] {
    let result = [];
    let locations = [];

    for (let i = 0; i < s.length; i++) {
        if (s[i] == c) {
            locations.push(i);
        }
    }

    let index = 0;
    for (let i = 0; i < s.length; i++) {
        if (index == 0) {
            result.push(locations[index] - i);
        } else if (index == locations.length) {
            result.push(i - locations[index - 1]);
        } else {
            result.push(Math.min(i - locations[index - 1], locations[index] - i));
        }

        if (locations[index] == i) {
            index++;
        }
    }

    return result;
}