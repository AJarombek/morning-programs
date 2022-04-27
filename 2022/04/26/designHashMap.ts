/**
 * https://leetcode.com/problems/design-hashmap/
 * @author Andrew Jarombek
 * @since 4/26/2022
 */

class MyHashMap {
    private entries = [];

    constructor() {
        for (let i = 0; i < 100; i++)
            this.entries.push([]);
    }

    put(key: number, value: number): void {
        let index = key * 31 % 100;

        for (let entry of this.entries[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        this.entries[index].push({key, value});
    }

    get(key: number): number {
        let index = key * 31 % 100;

        for (let entry of this.entries[index]) {
            if (entry.key == key) {
                return entry.value;
            }
        }

        return -1;
    }

    remove(key: number): void {
        let index = key * 31 % 100;
        let entries = this.entries[index];
        let newEntries = [];

        for (let entry of entries) {
            if (entry.key != key) {
                newEntries.push(entry);
            }
        }

        this.entries[index] = newEntries;
    }
}