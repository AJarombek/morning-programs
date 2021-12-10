/**
 * https://leetcode.com/problems/design-an-ordered-stream/
 * @author Andrew Jarombek
 * @since 12/9/2021
 */

import java.util.ArrayList;
import java.util.List;

class OrderedStream {

    private String[] array;
    private int index;

    public OrderedStream(int n) {
        this.array = new String[n];
        this.index = 0;
    }

    public List<String> insert(int idKey, String value) {
        this.array[idKey - 1] = value;

        List<String> result = new ArrayList<>();

        while (this.index < this.array.length && this.array[this.index] != null) {
            result.add(this.array[this.index]);
            this.index++;
        }

        return result;
    }
}