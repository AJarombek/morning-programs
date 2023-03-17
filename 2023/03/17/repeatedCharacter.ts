/**
 * https://leetcode.com/problems/first-letter-to-appear-twice/
 * @author Andrew Jarombek
 * @since 3/17/2023
 */

function repeatedCharacter(s: string): string {
    const set = new Set<string>();

    for (let c of s) {
        if (set.has(c)) {
            return c;
        }

        set.add(c);
    }

    return "";
}
