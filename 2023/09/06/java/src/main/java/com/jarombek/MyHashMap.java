/*
 * https://leetcode.com/problems/design-hashmap/
 * @author Andrew Jarombek
 * @since 9/6/2023
 */

package com.jarombek;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MyHashMap {

    private List<List<Map.Entry<Integer, Integer>>> buckets;

    public MyHashMap() {
        this.buckets = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            buckets.add(new ArrayList<>());
        }
    }

    public void put(int key, int value) {
        var bucket = this.buckets.get(key % 1000);

        for (var entry : bucket) {
            if (entry.getKey() == key) {
                entry.setValue(value);
                return;
            }
        }

        bucket.add(new Entry<>(key, value));
    }

    public int get(int key) {
        var bucket = this.buckets.get(key % 1000);

        for (var entry : bucket) {
            if (entry.getKey() == key) {
                return entry.getValue();
            }
        }

        return -1;
    }

    public void remove(int key) {
        var bucket = this.buckets.get(key % 1000);
        var newBucket = new ArrayList<Map.Entry<Integer, Integer>>();

        for (var entry : bucket) {
            if (entry.getKey() != key) {
                newBucket.add(entry);
            }
        }

        this.buckets.set(key % 1000, newBucket);
    }

    private static class Entry<K, V> implements Map.Entry<K, V> {

        private final K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V value) {
            this.value = value;
            return this.value;
        }

        @Override
        public boolean equals(Object o) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }
}
