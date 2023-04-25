/*
 * https://leetcode.com/problems/design-hashset/
 * @author Andrew Jarombek
 * @since 4/24/2023
 */

package com.jarombek;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
    private List<Integer>[] buckets;

    public MyHashSet() {
        this.buckets = new List[2000];
    }

    public void add(int key) {
        if (!this.contains(key)) {
            int index = key * 31 % 2000;
            List<Integer> bucket = this.buckets[index];

            if (bucket == null) {
                bucket = new ArrayList<>();
                this.buckets[index] = bucket;
            }

            bucket.add(key);
        }
    }

    public void remove(int key) {
        int index = key * 31 % 2000;
        List<Integer> bucket = this.buckets[index];

        if (bucket != null) {
            bucket.remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        int index = key * 31 % 2000;
        List<Integer> bucket = this.buckets[index];

        if (bucket == null) {
            return false;
        }

        for (int value : bucket) {
            if (value == key) {
                return true;
            }
        }

        return false;
    }
}
