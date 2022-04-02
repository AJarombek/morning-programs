/**
 * https://leetcode.com/problems/can-place-flowers/
 * @author Andrew Jarombek
 * @since 4/2/2022
 */

function canPlaceFlowers(flowerbed: number[], n: number): boolean {
    let total = 0;
    let consecutive = 1;

    for (let plot of flowerbed) {
        if (plot == 0) {
            consecutive++;
        } else {
            if (consecutive > 0) {
                total += Math.floor((consecutive - 1) / 2);

                if (total >= n) {
                    return true;
                }
            }

            consecutive = 0;
        }
    }

    total += Math.floor(consecutive / 2);
    return total >= n;
}
