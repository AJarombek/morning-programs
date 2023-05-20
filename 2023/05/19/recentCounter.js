/**
 * https://leetcode.com/problems/number-of-recent-calls/
 * @author Andrew Jarombek
 * @since 5/19/2023
 */

const assert = require('assert');

const RecentCounter = function() {
    this.items = [];
    this.index = 0;
};

RecentCounter.prototype.ping = function(t) {
    while (this.index < this.items.length && this.items[this.index] < t - 3000) {
        this.index++;
    }

    this.items.push(t);

    if (this.index > 10) {
        this.items = this.items.slice(this.index);
        this.index = 0;
    }

    return this.items.length - this.index
}

// Test case 1: Ping within the last 3000 milliseconds
let counter1 = new RecentCounter();
assert.strictEqual(counter1.ping(1000), 1, 'Test case 1 failed');
assert.strictEqual(counter1.ping(2000), 2, 'Test case 1 failed');
assert.strictEqual(counter1.ping(2500), 3, 'Test case 1 failed');

// Test case 2: Ping outside the last 3000 milliseconds
let counter2 = new RecentCounter();
assert.strictEqual(counter2.ping(1000), 1, 'Test case 2 failed');
assert.strictEqual(counter2.ping(4000), 2, 'Test case 2 failed');
assert.strictEqual(counter2.ping(6000), 2, 'Test case 2 failed');
assert.strictEqual(counter2.ping(8000), 2, 'Test case 2 failed');
