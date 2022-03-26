/**
 * https://leetcode.com/problems/relative-ranks/
 * @author Andrew Jarombek
 * @since 3/25/2022
 */

function findRelativeRanks(scores: number[]): string[] {
    let list = scores.map((score, index) => ({score, index}));
    list.sort((a, b) => b.score - a.score);

    let result = scores.map(x => "");
    result[list[0].index] = "Gold Medal";

    if (list.length > 1)
        result[list[1].index] = "Silver Medal";

    if (list.length > 2)
        result[list[2].index] = "Bronze Medal";

    for (let i = 3; i < list.length; i++) {
        result[list[i].index] = `${i+1}`;
    }

    return result;
}