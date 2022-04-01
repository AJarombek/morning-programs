/**
 * https://leetcode.com/problems/distribute-candies/
 * @author Andrew Jarombek
 * @since 3/31/2022
 */

function distributeCandies(candyType: number[]): number {
    let set = new Set<number>();

    for (let candy of candyType) {
        set.add(candy);
    }

    return Math.min(Math.floor(candyType.length / 2), set.size);
}