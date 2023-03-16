/**
 * https://leetcode.com/problems/decode-the-message/
 * @author Andrew Jarombek
 * @since 3/15/2023
 */

function decodeMessage(key: string, message: string): string {
    let set = new Set<string>();
    let map = new Map<string, number>();
    let index = 0;

    let i = 0;

    while (i < key.length && index < 26) {
        const c = key.charAt(i);

        if (c != ' ' && !set.has(c)) {
            set.add(c);
            map.set(c, index);
            index++;
        }

        i++;
    }

    let result = [];

    for (let c of message) {
        if (c == ' ') {
            result.push(c);
        } else {
            result.push(String.fromCharCode(97 + map.get(c)));
        }
    }

    return result.join("");
}