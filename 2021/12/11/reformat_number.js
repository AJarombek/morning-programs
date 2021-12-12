/**
 * https://leetcode.com/problems/reformat-phone-number/
 * @author Andrew Jarombek
 * @since 12/11/2021
 */

const reformatNumber = function(number) {
    const numbers = number.replace(/[\s-]/g, '');
    let index = 0;
    let result = '';

    while (index < numbers.length - 4) {
        result += numbers.substring(index, index + 3) + '-';
        index += 3;
    }

    const remaining = numbers.length - index;

    if (remaining === 4) {
        result += numbers.substring(index, index + 2) + '-' + numbers.substring(index + 2, index + 4);
    } else if (remaining === 3) {
        result += numbers.substring(index, index + 3);
    } else {
        result += numbers.substring(index, index + 2);
    }

    return result;
};