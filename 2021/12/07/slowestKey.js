/**
 * https://leetcode.com/problems/slowest-key/
 * @author Andrew Jarombek
 * @since 12/7/2021
 */

const slowestKey = function(releaseTimes, keysPressed) {
    let previous = 0;
    let slowestTime = -1;
    let slowestKey = null;

    for (let i = 0; i < releaseTimes.length; i++) {
        const time = releaseTimes[i] - previous;
        if (time > slowestTime) {
            slowestTime = time;
            slowestKey = keysPressed[i];
        } else if (time === slowestTime && keysPressed[i] > slowestKey) {
            slowestKey = keysPressed[i];
        }

        previous = releaseTimes[i];
    }

    return slowestKey;
};