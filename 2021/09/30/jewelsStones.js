/**
 * https://leetcode.com/problems/jewels-and-stones/
 * @author Andrew Jarombek
 * @since 9/30/2021
 */

const numJewelsInStones = function(jewels, stones) {
    const set = new Set();
    for (const jewel of jewels) {
        set.add(jewel);
    }

    let count = 0;
    for (const stone of stones) {
        if (set.has(stone)) {
            count++;
        }
    }

    return count;
};