/**
 * https://leetcode.com/problems/determine-color-of-a-chessboard-square/
 * @author Andrew Jarombek
 * @since 12/19/2021
 */

public class SquareColor {
    public boolean squareIsWhite(String coordinates) {
        int x = Integer.parseInt(coordinates.substring(0, 1), 20);
        int y = Integer.parseInt(coordinates.substring(1), 20);

        return x % 2 == y % 2;
    }
}
