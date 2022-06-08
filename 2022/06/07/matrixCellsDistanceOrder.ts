/**
 * https://leetcode.com/problems/matrix-cells-in-distance-order/
 * @author Andrew Jarombek
 * @since 6/7/2022
 */

function allCellsDistOrder(rows: number, cols: number, rCenter: number, cCenter: number): number[][] {
    let result = [];

    for (let i = 0; i < rows; i++) {
        for (let j = 0; j < cols; j++) {
            result.push([i, j]);
        }
    }

    result.sort((a, b) => {
        return (Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter)) -
            (Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter))
    });

    return result;
}