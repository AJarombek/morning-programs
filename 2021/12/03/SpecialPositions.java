/**
 * https://leetcode.com/problems/special-positions-in-a-binary-matrix/
 * @author Andrew Jarombek
 * @since 12/3/2021
 */

import java.util.HashSet;
import java.util.Set;

public class SpecialPositions {
    public int numSpecial(int[][] mat) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for (int i = 0; i < mat.length; i++) {
            int ones = 0;

            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    ones++;
                }
            }

            if (ones == 1) {
                rows.add(i);
            }
        }

        for (int j = 0; j < mat[0].length; j++) {
            int ones = 0;

            for (int i = 0; i < mat.length; i++) {
                if (mat[i][j] == 1) {
                    ones++;
                }
            }

            if (ones == 1) {
                cols.add(j);
            }
        }

        int result = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1 && rows.contains(i) && cols.contains(j)) {
                    result++;
                }
            }
        }

        return result;
    }
}
