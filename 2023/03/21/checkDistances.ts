/**
 * https://leetcode.com/problems/check-distances-between-same-letters/
 * @author Andrew Jarombek
 * @since 3/21/2023
 */

function checkDistances(s: string, distance: number[]): boolean {
    const map = new Map<string, number[]>();

    for (let i = 0; i < s.length; i++) {
        let c = s.charAt(i)
        let value = map.get(c) ?? [];
        value.push(i);

        map.set(c, value);
    }

    for (let i = 0; i < distance.length; i++) {
        const val = distance[i];
        const c = String.fromCharCode(97 + i);

        const contents = map.get(c);

        if (contents) {
            const [start, end] = contents;

            if (val + 1 != end - start) {
                return false;
            }
        }
    }

    return true;
}