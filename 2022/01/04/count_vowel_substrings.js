/**
 * https://leetcode.com/problems/count-vowel-substrings-of-a-string/
 * @author Andrew Jarombek
 * @since 1/4/2022
 */

const vowelSet = new Set();
vowelSet.add('a');
vowelSet.add('e');
vowelSet.add('i');
vowelSet.add('o');
vowelSet.add('u');

const countVowelSubstrings = function(word) {
    let count = 0;

    let start = 0;
    let end = 0;

    for (let i = 0; i < word.length; i++) {
        if (vowelSet.has(word.charAt(i))) {
            end = i;
        } else {
            if (end - start >= 4) {
                count += countSubstrings(word.substring(start, end + 1));
            }

            start = i + 1;
            end = i + 1;
        }
    }

    if (end - start >= 4) {
        count += countSubstrings(word.substring(start, end + 1));
    }

    return count;
};

const countSubstrings = function(word) {
    let count = 0;
    const set = new Set();

    for (let start = 0; start <= word.length - 5; start++) {
        for (let end = start + 5; end <= word.length; end++) {
            set.clear();

            for (let i = start; i < end; i++) {
                set.add(word.charAt(i));
            }

            if (set.size === 5) {
                count++;
            }
        }
    }

    return count;
}
