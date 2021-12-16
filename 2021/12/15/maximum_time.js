/**
 * https://leetcode.com/problems/latest-time-by-replacing-hidden-digits/
 * @author Andrew Jarombek
 * @since 12/15/2021
 */

const maximumTime = function(time) {
    const first = time.charAt(0);

    if (first === "?") {
        const second = time.charAt(1);

        if (second !== "?" && +second > 3) {
            time = `1${time.substring(1)}`;
        } else {
            time = `2${time.substring(1)}`;
        }
    }

    const second = time.charAt(1);

    if (second === "?") {
        const first = time.charAt(0);

        if (first === "2") {
            time = `${time.charAt(0)}3${time.substring(2)}`
        } else {
            time = `${time.charAt(0)}9${time.substring(2)}`
        }
    }

    const third = time.charAt(3) === "?" ? "5" : time.charAt(3);
    const fourth = time.charAt(4) === "?" ? "9" : time.charAt(4);
    return `${time.substring(0, 3)}${third}${fourth}`
};