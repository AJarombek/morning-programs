/**
 * https://leetcode.com/problems/minimum-index-sum-of-two-lists/
 * @author Andrew Jarombek
 * @since 4/1/2022
 */

function minIndexSum(list1: string[], list2: string[]): string[] {
    let map = new Map<string, number>();

    for (let i = 0; i < list1.length; i++) {
        const item = list1[i];
        map.set(item, i + 1);
    }

    let min = Number.MAX_VALUE;
    let result = [];

    for (let i = 0; i < list2.length; i++) {
        const item = list2[i];
        const j = map.get(item);
        const val = i + j;

        if (j && val <= min) {
            if (val < min) {
                min = val;
                result = [item];
            } else {
                result.push(item)
            }
        }
    }

    return result;
}