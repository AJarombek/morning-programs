/**
 * https://leetcode.com/problems/last-stone-weight/
 * @author Andrew Jarombek
 * @since 10/29/2021
 */

import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((x, y) -> y - x);

        for (int stone : stones) {
            queue.add(stone);
        }

        while (queue.size() > 1) {
            int y = queue.remove();
            int x = queue.remove();

            if (x != y) {
                queue.add(y - x);
            }
        }

        return queue.size() == 1 ? queue.remove() : 0;
    }
}
