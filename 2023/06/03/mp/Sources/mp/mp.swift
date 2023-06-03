/**
 https://leetcode.com/problems/island-perimeter/
 - Author: Andrew Jarombek
 - Date: 6/3/2023
 */

public class MorningPrograms {
    func islandPerimeter(_ grid: [[Int]]) -> Int {
        var result = 0

        for (rIndex, row) in grid.enumerated() {
            for (cIndex, cell) in row.enumerated() {
                if cell == 1 {
                    if rIndex == 0 || grid[rIndex-1][cIndex] == 0 {
                        result += 1
                    }

                    if cIndex == 0 || grid[rIndex][cIndex-1] == 0 {
                        result += 1
                    }

                    if rIndex == grid.count - 1 || grid[rIndex+1][cIndex] == 0 {
                        result += 1
                    }

                    if cIndex == grid[0].count - 1 || grid[rIndex][cIndex+1] == 0 {
                        result += 1
                    }
                }
            }
        }

        return result
    }
}
