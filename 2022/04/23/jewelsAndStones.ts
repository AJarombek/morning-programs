/**
 * https://leetcode.com/problems/jewels-and-stones/
 * @author Andrew Jarombek
 * @since 4/23/2022
 */

function numJewelsInStones(jewels: string, stones: string): number {
    let set = new Set<string>();

    for (let jewel of jewels) {
        set.add(jewel);
    }

    let count = 0;

    for (let stone of stones) {
        if (set.has(stone)) {
            count++;
        }
    }

    return count;
}
