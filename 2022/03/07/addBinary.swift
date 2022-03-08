// https://leetcode.com/problems/add-binary/
// Author: Andrew Jarombek
// Date: 3/7/2022

func addBinary(_ a: String, _ b: String) -> String {
    var remainder = 0
    var result = ""

    var i = a.count - 1
    var j = b.count - 1

    while i >= 0 || j >= 0 {
        var x = 0

        if i >= 0 {
            let aIndex = a.index(a.startIndex, offsetBy: i)
            x = Int(a[aIndex...aIndex])!
        }

        var y = 0

        if j >= 0 {
            let bIndex = b.index(b.startIndex, offsetBy: j)
            y = Int(b[bIndex...bIndex])!
        }

        let val = remainder + x + y

        result = "\(val % 2)\(result)"
        remainder = val / 2

        i -= 1;
        j -= 1;
    }

    if remainder == 1 {
        return "1\(result)"
    }

    return result
}