/**
 * https://leetcode.com/problems/distribute-candies/
 * @author Andrew Jarombek
 * @since 9/14/2022
 */

const distributeCandies = function(candyType) {
    const set = new Set();

    for (let candy of candyType)
        set.add(candy);

    return Math.min(set.size, Math.floor(candyType.length / 2));
};

console.assert(distributeCandies([1,1,2,2,3,3]) === 3);
console.assert(distributeCandies([1,1,2,3]) === 2);
console.assert(distributeCandies([1,1,1,1]) === 1);