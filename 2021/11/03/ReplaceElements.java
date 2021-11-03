/**
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 * @author Andrew Jarombek
 * @since 11/3/2021
 */

public class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int value = arr[i];
            arr[i] = max;

            if (value > max) {
                max = value;
            }
        }

        return arr;
    }
}
