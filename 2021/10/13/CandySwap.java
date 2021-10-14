/**
 * https://leetcode.com/problems/fair-candy-swap/
 * @author Andrew Jarombek
 * @since 10/13/2021
 */

public class CandySwap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;

        for (int size: aliceSizes) {
            aliceTotal += size;
        }

        for (int size: bobSizes) {
            bobTotal += size;
        }

        for (int i: aliceSizes) {
            for (int j: bobSizes) {
                if (aliceTotal - i + j == bobTotal - j + i) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {-1, -1};
    }
}
