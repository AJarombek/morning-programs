import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle-ii
 * @author Andrew Jarombek
 * @since 7/29/2021
 */

public class PascalTriangle {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> nextResult = new ArrayList<>();
            nextResult.add(1);

            for (int j = 1; j < i; j++) {
                nextResult.add(result.get(j) + result.get(j-1));
            }

            nextResult.add(1);
            result = nextResult;
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> result = PascalTriangle.getRow(3);
        assert result.size() == 4;
        assert result.get(0) == 1;
        assert result.get(1) == 3;
        assert result.get(2) == 3;
        assert result.get(3) == 1;
    }
}
