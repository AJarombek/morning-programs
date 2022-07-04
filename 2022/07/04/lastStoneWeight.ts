/**
 * https://leetcode.com/problems/last-stone-weight/
 * @author Andrew Jarombek
 * @since 7/4/2022
 */

function lastStoneWeight(stones: number[]): number {
    // Ideally would use a priority queue here, but TypeScript/JavaScript does not supply one
    // and I'm too lazy to build an implementation myself.
    let count = stones.length;

    while (count > 1) {
        let maxStone = stones[0];
        let maxIndex = 0;
        let secondMaxStone = 0;
        let secondMaxIndex = 0;

        for (let i = 0; i < stones.length; i++) {
            let stone = stones[i];

            if (stone > maxStone) {
                maxStone = stone;
                maxIndex = i;
            }
        }

        for (let i = 0; i < stones.length; i++) {
            let stone = stones[i];

            if (stone > secondMaxStone && i != maxIndex) {
                secondMaxStone = stone;
                secondMaxIndex = i;
            }
        }

        stones[maxIndex] = 0;

        if (maxStone == secondMaxStone) {
            stones[secondMaxIndex] = 0;
            count -= 2;
        } else {
            stones[secondMaxIndex] = maxStone - secondMaxStone;
            count--;
        }
    }

    if (count == 1) {
        for (let stone of stones) {
            if (stone > 0)
                return stone;
        }
    }

    return 0;
}