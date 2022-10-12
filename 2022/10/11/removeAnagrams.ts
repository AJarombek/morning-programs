/**
 * https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/
 * @author Andrew Jarombek
 * @since 10/11/2022
 */

function removeAnagrams(words: string[]): string[] {
    const result = [];
    let index = 0;
    let prev = '';

    while (index < words.length) {
        let chars = words[index].split('');
        chars.sort((a, b) => a.charCodeAt(0) - b.charCodeAt(0));
        const key = chars.join('');

        if (prev != key) {
            prev = key;
            index++;
        } else {
            words.splice(index, 1);
            index = 0;
            prev = '';
        }
    }

    return words;
}

function removeAnagramsV1(words: string[]): string[] {
    const result = [];
    const set = new Set<string>();

    for (let word of words) {
        let chars = word.split('');
        chars.sort((a, b) => a.charCodeAt(0) - b.charCodeAt(0));
        const key = chars.join('');

        if (!set.has(key)) {
            result.push(word);
            set.add(key);
        }
    }

    return result;
}