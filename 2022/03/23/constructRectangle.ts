/**
 * https://leetcode.com/problems/construct-the-rectangle/
 * @author Andrew Jarombek
 * @since 3/23/2022
 */

function constructRectangle(area: number): number[] {
    let result = [area, 1];
    let x = Math.ceil(area / 2);
    let y = 2;

    while (x >= y) {
        let val = x * y;

        if (val == area) {
            result = [x, y];
            x--;
            y++;
        } else if (val > area) {
            x--;
        } else {
            y++;
        }
    }

    return result;
}
