/**
 * https://leetcode.com/problems/distribute-candies-to-people/
 * @author Andrew Jarombek
 * @since 9/28/2022
 */

function distributeCandies(candies: number, num_people: number): number[] {
    let result = [];

    for (let i = 0; i < num_people; i++)
        result.push(0);

    let index = 0;

    while (candies > 0) {
        result[index % num_people] += Math.min(index + 1, candies);
        candies -= index + 1;
        index++;
    }

    return result;
}