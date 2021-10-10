/**
 * https://leetcode.com/problems/binary-gap/
 * @author Andrew Jarombek
 * @since 10/10/2021
 */

public class BinaryGap {
    public int binaryGap(int n) {
        if (n < 2) {
            return 0;
        }

        int gap = 0;
        boolean oneFound = false;
        int lastOne = 0;
        int i = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                if (oneFound) {
                    if (i - lastOne > gap) {
                        gap = i - lastOne;
                    }
                } else {
                    oneFound = true;
                }

                lastOne = i;
            }

            i++;
            n /= 2;
        }

        return gap;
    }
}
