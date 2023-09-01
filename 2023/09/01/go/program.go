/**
 * https://leetcode.com/problems/design-hashmap/
 * Author: Andrew Jarombek
 * Date: 9/1/2023
 */

package _go

type Entry struct {
	Key   int
	Value int
}

type MyHashMap struct {
	Buckets [][]Entry
}

func Constructor() MyHashMap {
	return MyHashMap{Buckets: make([][]Entry, 1000)}
}

func (hashMap *MyHashMap) Put(key int, value int) {
	bucket := hashMap.Buckets[key%1000]

	for i, entry := range bucket {
		if entry.Key == key {
			bucket[i].Value = value
			return
		}
	}

	hashMap.Buckets[key%1000] = append(bucket, Entry{Key: key, Value: value})
}

func (hashMap *MyHashMap) Get(key int) int {
	bucket := hashMap.Buckets[key%1000]

	for _, entry := range bucket {
		if entry.Key == key {
			return entry.Value
		}
	}

	return -1
}

func (hashMap *MyHashMap) Remove(key int) {
	bucket := hashMap.Buckets[key%1000]
	newBucket := make([]Entry, 0)

	for _, entry := range bucket {
		if entry.Key != key {
			newBucket = append(newBucket, entry)
		}
	}

	hashMap.Buckets[key%1000] = newBucket
}
