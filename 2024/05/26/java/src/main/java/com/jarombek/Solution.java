/*
 * https://leetcode.com/problems/number-of-recent-calls/
 * @author Andrew Jarombek
 * @since 5/26/2024
 */

package com.jarombek;

import java.util.ArrayDeque;
import java.util.Deque;

class RecentCounter {
    private Deque<Integer> deque;

    public RecentCounter() {
        deque = new ArrayDeque<>();
    }

    public int ping(int t) {
        deque.add(t);

        while (deque.peek() < t - 3000) {
            deque.poll();
        }

        return deque.size();
    }
}
