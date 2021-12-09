/**
 * https://leetcode.com/problems/check-array-formation-through-concatenation/
 * @author Andrew Jarombek
 * @since 12/8/2021
 */

public class CanFormArray {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int index = 0;

        while (index < arr.length) {
            boolean found = false;
            int pieceIndex = 0;

            while (pieceIndex < pieces.length && !found) {
                int[] piece = pieces[pieceIndex];

                if (piece[0] == arr[index]) {
                    found = true;

                    for (int i = 1; i < piece.length; i++) {
                        index++;

                        if (piece[i] != arr[index]) {
                            return false;
                        }
                    }
                }

                pieceIndex++;
            }

            if (!found) {
                return false;
            }

            index++;
        }

        return true;
    }
}
