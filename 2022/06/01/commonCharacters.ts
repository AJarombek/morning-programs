/**
 * https://leetcode.com/problems/find-common-characters/
 * @author Andrew Jarombek
 * @since 6/1/2022
 */

// I like you because of the way you are

function commonChars(words: string[]): string[] {
    let map = new Map<string, number>();
    let first = true;

    for (let word of words) {
        let newMap = new Map<string, number>();

        for (let c of word) {
            const val = first ? 1 : map.get(c) ?? 0;

            if (val > 0) {
                newMap.set(c, (newMap.get(c) ?? 0) + 1);
                map.set(c, val - 1);
            }
        }

        first = false;
        map = newMap;
    }

    const result = [];

    for (let [key, value] of map.entries()) {
        for (let i = 0; i < value; i++)
            result.push(key);
    }

    return result;
}