/**
 * https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
 * @author Andrew Jarombek
 * @since 11/16/2021
 */

import java.util.PriorityQueue;

class KWeakestRows {
    public static class Row {
        private int index;
        private int value;

        public Row(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }


    public int[] kWeakestRows(int[][] mat, int k) {

        PriorityQueue<Row> queue = new PriorityQueue<>((x, y) -> {
            if (x.value == y.value) {
                return x.index - y.index;
            } else {
                return x.value - y.value;
            }
        });

        for (int i = 0; i < mat.length; i++) {
            int[] row = mat[i];

            int count = 0;
            while (count < row.length && row[count] == 1) {
                count++;
            }

            queue.add(new Row(i, count));
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = queue.poll().index;
        }

        return result;
    }
}
