/**
 * https://leetcode.com/problems/rearrange-characters-to-make-target-string/
 * @author Andrew Jarombek
 * @since 3/12/2023
 */

function rearrangeCharacters(s: string, target: string): number {
    let sMap = new Map<string, number>();
    let tMap = new Map<string, number>();

    for (let c of s) {
        sMap.set(c, (sMap.get(c) ?? 0) + 1);
    }

    for (let c of target) {
        tMap.set(c, (tMap.get(c) ?? 0) + 1);
    }

    let result = Infinity;

    tMap.forEach((value, key) => {
        let sourceValue = sMap.get(key) ?? 0;
        result = Math.min(result, Math.floor(sourceValue / value));
    });

    return result;
}
