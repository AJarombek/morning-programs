/**
 * https://leetcode.com/problems/design-hashset/
 * @author Andrew Jarombek
 * @since 4/25/2022
 */

class MyHashSet {
    private items = [];

    constructor() {
        for (let i = 0; i < 100; i++)
            this.items.push([]);
    }

    add(key: number): void {
        this.items[key * 31 % 100].push(key);
    }

    remove(key: number): void {
        let values = this.items[key * 31 % 100];
        let result = [];

        for (let value of values) {
            if (value != key) {
                result.push(value);
            }
        }

        this.items[key * 31 % 100] = result;
    }

    contains(key: number): boolean {
        let values = this.items[key * 31 % 100];

        for (let value of values) {
            if (value == key) {
                return true;
            }
        }

        return false;
    }
}