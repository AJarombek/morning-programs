// https://leetcode.com/problems/pascals-triangle/
// Author: Andrew Jarombek
// Date: 3/14/2022

func generate(_ numRows: Int) -> [[Int]] {
    var result = [[1]]

    if numRows == 1 {
        return result
    }

    var row = 1

    while row < numRows {
        var item = [1]
        var index = 1

        while index < row {
            item.append(result[row - 1][index] + result[row - 1][index - 1])
            index += 1
        }

        item.append(1)
        result.append(item)
        row += 1
    }

    return result
}
