/**
 * https://leetcode.com/problems/word-pattern/
 * @author Andrew Jarombek
 * @since 2/26/2022
 */

function wordPattern(pattern: string, s: string): boolean {
    const words = s.split(" ");

    if (words.length != pattern.length) {
        return false;
    }

    const patternMap = new Map<string, string>();
    const patternSet = new Set<string>();

    for (let index = 0; index < words.length; index++) {
        const word = words[index];
        const key = pattern.charAt(index);

        if (patternMap.has(key)) {
            if (patternMap.get(key) != word) {
                return false;
            }
        } else {
            if (patternSet.has(word)) {
                return false;
            }

            patternSet.add(word);
            patternMap.set(key, word);
        }
    }

    return true;
}