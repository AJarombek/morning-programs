/**
 * https://leetcode.com/problems/distance-between-bus-stops/
 * @author Andrew Jarombek
 * @since 10/6/2022
 */

function distanceBetweenBusStops(distance: number[], start: number, destination: number): number {
    let total = 0;

    for (let edge of distance) {
        total += edge;
    }

    let i = start;
    let clockwise = 0;

    while (i != destination) {
        clockwise += distance[i];
        i = (i + 1) % distance.length;
    }

    return Math.min(clockwise, total - clockwise);
}
