/**
 * https://leetcode.com/problems/construct-the-rectangle/
 * @author Andrew Jarombek
 * @since 9/4/2021
 */

// Visiting Joe in Mass today

const assert = (assertion) => {
    console.assert(assertion, `Assertion failed!`);
};

const constructRectangle = function(area) {
    const sqrt = Math.round(Math.pow(area, 1/2));
    let start = sqrt;
    let end = sqrt;

    while (start > 1 || end < area) {
        const result = start * end;
        if (result === area) {
            return [end, start];
        } else if (result < area) {
            end++;
        } else {
            start--;
        }
    }

    return [area, 1];
};

const result = constructRectangle(4);
assert(result[0] === 2);
assert(result[1] === 2);
