/**
 * https://leetcode.com/problems/rings-and-rods/
 * @author Andrew Jarombek
 * @since 1/7/2022
 */

public class RingsAndRods {
    public int countPoints(String rings) {
        int[][] rods = new int[10][3];
        int index = 0;

        while (index < rings.length()) {
            char c = rings.charAt(index);
            int r = Character.getNumericValue(rings.charAt(index + 1));

            if (c == 'R') {
                rods[r][0] += 1;
            } else if (c == 'G') {
                rods[r][1] += 1;
            } else {
                rods[r][2] += 1;
            }

            index += 2;
        }

        int result = 0;
        for (int[] rod : rods) {
            if (rod[0] > 0 && rod[1] > 0 && rod[2] > 0)
                result++;
        }

        return result;
    }
}
