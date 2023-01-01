/*
 * https://leetcode.com/problems/kth-largest-element-in-a-stream/
 * @author Andrew Jarombek
 * @since 1/1/2023
 */

package com.jarombek;

import java.util.PriorityQueue;

class KthLargest {
    private PriorityQueue<Integer> queue;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.queue = new PriorityQueue<>();
        this.k = k;

        for (int num : nums) {
            this.queue.add(num);
        }
    }

    public int add(int val) {
        this.queue.add(val);

        while (this.queue.size() > k) {
            this.queue.poll();
        }

        return this.queue.peek();
    }
}
