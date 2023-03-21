/**
 * https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
 * @author Andrew Jarombek
 * @since 3/20/2023
 */

function minimumRecolors(blocks: string, k: number): number {
    let values = {'W': 0, 'B': 0};
    let index = 0;

    while (index < k) {
        values[blocks.charAt(index)]++;
        index++;
    }

    let result = values['W'];

    while (index < blocks.length) {
        values[blocks.charAt(index)]++;
        values[blocks.charAt(index - k)]--;
        index++;

        result = Math.min(result, values['W']);
    }

    return result;
}