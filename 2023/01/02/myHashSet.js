/**
 * https://leetcode.com/problems/design-hashset/
 * @author Andrew Jarombek
 * @since 1/2/2023
 */

const MyHashSet = function() {
    this.buckets = [];

    for (let i = 0; i < 100; i++)
        this.buckets.push([]);
};

/**
 * @param {number} key
 * @return {void}
 */
MyHashSet.prototype.add = function(key) {
    this.buckets[(key * 31) % 100].push(key);
};

/**
 * @param {number} key
 * @return {void}
 */
MyHashSet.prototype.remove = function(key) {
    let bucket = this.buckets[(key * 31) % 100];
    this.buckets[(key * 31) % 100] = bucket.filter((val) => val !== key);
};

/**
 * @param {number} key
 * @return {boolean}
 */
MyHashSet.prototype.contains = function(key) {
    return this.buckets[(key * 31) % 100].includes(key);
};

const hashSet = new MyHashSet();
hashSet.add(1);
hashSet.add(2);

console.assert(hashSet.contains(1));
console.assert(!hashSet.contains(3));

hashSet.add(2);
console.assert(hashSet.contains(2));

hashSet.remove(2);
console.assert(!hashSet.contains(2));
