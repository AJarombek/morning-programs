/**
 * https://leetcode.com/problems/island-perimeter/
 * @author Andrew Jarombek
 * @since 9/2/2021
 */

public class IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    if (i-1 < 0 || grid[i-1][j] == 0) {
                        perimeter++;
                    }

                    if (j-1 < 0 || grid[i][j-1] == 0) {
                        perimeter++;
                    }

                    if (i+1 == grid.length || grid[i+1][j] == 0) {
                        perimeter++;
                    }

                    if (j+1 == grid[i].length || grid[i][j+1] == 0) {
                        perimeter++;
                    }
                }
            }
        }

        return perimeter;
    }

    public static void main(String[] args) {
        assert islandPerimeter(new int[][]{new int[] {0, 1}}) == 4;
    }
}
