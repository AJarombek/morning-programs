/**
 * https://leetcode.com/problems/jewels-and-stones/
 * @author Andrew Jarombek
 * @since 12/30/2022
 */

const numJewelsInStones = function(jewels, stones) {
    const set = new Set(jewels.split(""));
    let result = 0;

    for (let stone of stones.split("")) {
        if (set.has(stone)) {
            result++;
        }
    }

    return result;
}

console.assert(numJewelsInStones("aA", "aAAbbbb") === 3);
console.assert(numJewelsInStones("z", "ZZ") === 0);
