/*
 * https://leetcode.com/problems/get-maximum-in-generated-array/
 * @author Andrew Jarombek
 * @since 8/28/2022
 */

import java.util.LinkedList;
import java.util.Queue;

public class MaxInGeneratedArray {
    public static int getMaximumGenerated(int n) {
        if (n < 2)
            return n;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        int index = 2;
        int result = 1;

        while (index <= n) {
            if (index % 2 == 0) {
                queue.add(queue.peek());
            } else {
                int val = queue.poll() + queue.peek();
                result = Math.max(result, val);
                queue.add(val);
            }

            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        assert getMaximumGenerated(7) == 3;
        assert getMaximumGenerated(2) == 1;
        assert getMaximumGenerated(3) == 2;
        assert getMaximumGenerated(99) == 21;
    }
}
