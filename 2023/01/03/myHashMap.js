/**
 * https://leetcode.com/problems/design-hashmap/
 * @author Andrew Jarombek
 * @since 1/3/2023
 */

const MyHashMap = function() {
    this.buckets = [];

    for (let i = 0; i < 100; i++) {
        this.buckets.push({});
    }
};

MyHashMap.prototype.put = function(key, value) {
    const bucket = this.buckets[(key * 31) % 100];
    bucket[key] = value;
    this.buckets[(key * 31) % 100] = bucket;
};

MyHashMap.prototype.get = function(key) {
    const bucket = this.buckets[(key * 31) % 100];

    if (key in bucket) {
        return bucket[key];
    }

    return -1;
};

MyHashMap.prototype.remove = function(key) {
    const bucket = this.buckets[(key * 31) % 100];
    delete bucket[key];
    this.buckets[(key * 31) % 100] = bucket;
};

const hashMap = new MyHashMap();
hashMap.put(1, 1);
hashMap.put(2, 2);

console.assert(hashMap.get(1) === 1);
console.assert(hashMap.get(3) === -1);

hashMap.put(2, 1);
console.assert(hashMap.get(2) === 1);

hashMap.remove(2);
console.assert(hashMap.get(2) === -1);
