// https://leetcode.com/problems/pascals-triangle-ii/
// Author: Andrew Jarombek
// Date: 4/20/2022

func getRow(_ rowIndex: Int) -> [Int] {
    if rowIndex == 0 {
        return [1]
    }

    var row = 1
    var result = [1, 1]

    while row < rowIndex {
        var item = [1]
        var index = 1

        while index <= row {
            item.append(result[index] + result[index - 1])
            index += 1
        }

        item.append(1)
        result = item
        row += 1
    }

    return result
}