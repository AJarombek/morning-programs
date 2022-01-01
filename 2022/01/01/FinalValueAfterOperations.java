/**
 * https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 * @author Andrew Jarombek
 * @since 1/1/2022
 */

public class FinalValueAfterOperations {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for (String operation : operations) {
            result += operation.charAt(1) == '-' ? -1 : 1;
        }

        return result;
    }
}
