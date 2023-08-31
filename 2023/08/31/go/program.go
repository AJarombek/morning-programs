/**
 * https://leetcode.com/problems/rotate-string/
 * Author: Andrew Jarombek
 * Date: 8/31/2023
 */

package _go

type MyHashSet struct {
	Buckets [][]int
}

func Constructor() MyHashSet {
	return MyHashSet{Buckets: make([][]int, 1000)}
}

func (set *MyHashSet) Add(key int) {
	bucket := key % 1000
	set.Buckets[bucket] = append(set.Buckets[bucket], key)
}

func (set *MyHashSet) Remove(key int) {
	bucket := set.Buckets[key%1000]
	var newBucket []int

	for i, v := range bucket {
		if v != key {
			newBucket = append(newBucket, bucket[i])
		}
	}

	set.Buckets[key%1000] = newBucket
}

func (set *MyHashSet) Contains(key int) bool {
	bucket := set.Buckets[key%1000]

	for _, v := range bucket {
		if v == key {
			return true
		}
	}

	return false
}
