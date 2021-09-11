/**
 * https://leetcode.com/problems/zigzag-conversion/
 * @author Andrew Jarombek
 * @since 9/10/2021
 */


import java.util.ArrayList;
import java.util.List;

public class ZigZag {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int currentRow = 0;
        boolean movingDown = true;

        List<StringBuilder> sbl = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            sbl.add(new StringBuilder());
        }

        for (int i = 0; i < s.length(); i++) {
            sbl.get(currentRow).append(s.charAt(i));

            if (movingDown) {
                if (currentRow == numRows - 1) {
                    movingDown = false;
                    currentRow--;
                } else {
                    currentRow++;
                }
            } else {
                if (currentRow == 0) {
                    movingDown = true;
                    currentRow++;
                } else {
                    currentRow--;
                }
            }
        }

        for (StringBuilder sbi: sbl) {
            sb.append(sbi);
        }

        return sb.toString();
    }
}
