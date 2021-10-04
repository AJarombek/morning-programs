/**
 * https://leetcode.com/problems/design-hashmap/
 * @author Andrew Jarombek
 * @since 10/3/2021
 */

import java.util.ArrayList;
import java.util.List;

class MyHashMap {

    private List<List<Entry>> items;

    public static class Entry {
        private int key;
        private int value;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return this.key;
        }

        public int getValue() {
            return this.value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public MyHashMap() {
        this.items = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {
            this.items.add(null);
        }
    }

    public void put(int key, int value) {
        int index = key % 100;
        List<Entry> bucket = items.get(index);

        if (bucket == null) {
            bucket = new ArrayList<>();
            items.set(index, bucket);
        }

        for (Entry entry : bucket) {
            if (entry.getKey() == key) {
                entry.setValue(value);
                return;
            }
        }

        bucket.add(new Entry(key, value));
    }

    public int get(int key) {
        int index = key % 100;
        List<Entry> bucket = items.get(index);

        if (bucket == null) {
            return -1;
        } else {
            for (Entry entry : bucket) {
                if (entry.getKey() == key) {
                    return entry.getValue();
                }
            }

            return -1;
        }
    }

    public void remove(int key) {
        int index = key % 100;
        List<Entry> bucket = items.get(index);

        if (bucket != null) {
            for (int i = 0; i < bucket.size(); i++) {
                if (bucket.get(i).getKey() == key) {
                    bucket.remove(i);
                    break;
                }
            }
        }
    }
}