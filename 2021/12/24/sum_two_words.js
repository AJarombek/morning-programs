/**
 * https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/
 * @author Andrew Jarombek
 * @since 12/24/2021
 */

const isSumEqual = function(firstWord, secondWord, targetWord) {
    const offset = 'a'.charCodeAt(0);

    let first = '';
    for (let c of firstWord) {
        first += `${c.charCodeAt(0) - offset}`;
    }

    let second = '';
    for (let c of secondWord) {
        second += `${c.charCodeAt(0) - offset}`;
    }

    let target = '';
    for (let c of targetWord) {
        target += `${c.charCodeAt(0) - offset}`;
    }

    return +first + +second === +target;
};