/**
 * https://leetcode.com/problems/decode-xored-array/
 * @author Andrew Jarombek
 * @since 12/13/2021
 */

const decode = function(encoded, first) {
    const result = [first];

    for (let value of encoded) {
        result.push(value ^ result[result.length - 1]);
    }

    return result;
};
