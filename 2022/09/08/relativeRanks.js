/**
 * https://leetcode.com/problems/relative-ranks/
 * @author Andrew Jarombek
 * @since 9/8/2022
 */

const findRelativeRanks = function(score) {
    const sorted = [...score].sort((a, b) => b - a);
    const map = new Map();

    for (let i = 0; i < sorted.length; i++) {
        map.set(sorted[i], i + 1);
    }

    for (let i = 0; i < score.length; i++) {
        let val = `${map.get(score[i])}`;

        if (val === "1") {
            val = "Gold Medal";
        } else if (val === "2") {
            val = "Silver Medal";
        } else if (val === "3") {
            val = "Bronze Medal";
        }

        score[i] = val;
    }

    return score;
};

let result = findRelativeRanks([5, 4, 3, 2, 1]);
let expected = ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
console.assert(expected.every((value, index) => value === result[index]));