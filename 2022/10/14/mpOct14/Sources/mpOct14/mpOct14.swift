/**
 https://leetcode.com/problems/excel-sheet-column-title/
 - Author: Andrew Jarombek
 - Date: 10/14/2022
 */

public struct mpOct14 {
    func convertToTitle(_ columnNumber: Int) -> String {
        if columnNumber == 1 {
            return "A"
        }

        var num = columnNumber
        var title: [String] = []
        let a: Character = "A"
        let base = Int(a.asciiValue!)

        while num > 0 {
            let val = base + ((num - 1) % 26)
            num = (num - 1) / 26
            title.append(String(UnicodeScalar(val)!))
        }

        title.reverse()
        return title.joined()
    }
}
