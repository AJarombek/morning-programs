/**
 * https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter/
 * @author Andrew Jarombek
 * @since 12/28/2021
 */

const minTimeToType = function(word) {
    let time = 0;
    let offset = 'a'.charCodeAt(0);
    let pointer = 0;

    for (let c of word) {
        let newPointer = c.charCodeAt(0) - offset;
        let distance = Math.abs(pointer - newPointer);
        time += Math.min(distance, 26 - distance) + 1;
        pointer = newPointer;
    }

    return time;
};