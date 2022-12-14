/**
 * https://leetcode.com/problems/can-place-flowers/
 * @author Andrew Jarombek
 * @since 12/13/2022
 */

const canPlaceFlowers = function(flowerbed, n) {
    let index = 0;
    while (n > 0 && index < flowerbed.length) {
        const prev = index === 0 ? 0 : flowerbed[index - 1];
        const next = index === flowerbed.length - 1 ? 0 : flowerbed[index + 1];

        if (!prev && !next && flowerbed[index] === 0) {
            flowerbed[index] = 1;
            n--;
        }

        index++;
    }

    return n === 0;
};

console.assert(canPlaceFlowers([0, 0, 1, 0], 1));
console.assert(!canPlaceFlowers([0, 1, 1, 0], 1));
