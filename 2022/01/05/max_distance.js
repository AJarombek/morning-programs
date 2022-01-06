/**
 * https://leetcode.com/problems/two-furthest-houses-with-different-colors/
 * @author Andrew Jarombek
 * @since 1/5/2022
 */

const maxDistance = function(colors) {
    let result = 0;
    let i = 0;
    let j = colors.length - 1;

    while (i < colors.length - 1 && colors.length - i > result) {
        let distance = 0;

        while (distance === 0 && i < j) {
            if (colors[i] !== colors[j]) {
                distance = j - i;
            }

            j--;
        }

        result = Math.max(result, distance);
        i++;
        j = colors.length - 1;
    }

    return result;
};