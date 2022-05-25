/**
 * https://leetcode.com/problems/number-of-recent-calls/
 * @author Andrew Jarombek
 * @since 5/24/2022
 */

class RecentCounter {
    private queue;

    constructor() {
        this.queue = [];
    }

    ping(t: number): number {
        this.queue.push(t);

        while (this.queue[0] < t - 3000) {
            this.queue.shift();
        }

        return this.queue.length;
    }
}