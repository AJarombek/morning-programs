/**
 * https://leetcode.com/problems/max-consecutive-ones/
 * @author Andrew Jarombek
 * @since 9/7/2022
 */

const findWords = function(words) {
    const rows = ["qwertyuiop", "asdfghjkl", "zxcvbnm"];
    const sets = [];

    for (let row of rows) {
        const set = new Set();

        for (let c of row) {
            set.add(c);
        }

        sets.push(set);
    }

    const result = [];

    for (let word of words) {
        let set = null;
        let c = word.charAt(0).toLowerCase();

        if (sets[0].has(c)) {
            set = sets[0];
        } else if (sets[1].has(c)) {
            set = sets[1];
        } else {
            set = sets[2];
        }

        let matches = true;
        for (let c of word) {
            if (!set.has(c.toLowerCase())) {
                matches = false;
                break;
            }
        }

        if (matches)
            result.push(word);
    }

    return result;
};

let result = findWords(["abc", "def", "ghi", "jkl"]);
let expected = ["jkl"]
console.assert(expected.every((value, index) => value === result[index]));
