/**
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/
 * @author Andrew Jarombek
 * @since 5/11/2022
 */

function uncommonFromSentences(s1: string, s2: string): string[] {
    let map = new Map<string, number>();

    addToMap(s1, map);
    addToMap(s2, map);

    let result = [];

    for (let [key, value] of map.entries()) {
        if (value == 1)
            result.push(key);
    }

    return result;
}

function addToMap(s: string, map: Map<string, number>) {
    for (let c of s.split(" ")) {
        map.set(c, (map.get(c) ?? 0) + 1);
    }
}