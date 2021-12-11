/**
 * https://leetcode.com/problems/goal-parser-interpretation/
 * @author Andrew Jarombek
 * @since 12/10/2021
 */

const interpret = function(command) {
    let result = '';

    let index = 0;
    while (index < command.length) {
        if (command.charAt(index) === 'G') {
            result += 'G';
            index++;
        } else if (command.charAt(index + 1) === ')') {
            result += 'o';
            index += 2;
        } else {
            result += 'al';
            index += 4;
        }
    }

    return result;
};
