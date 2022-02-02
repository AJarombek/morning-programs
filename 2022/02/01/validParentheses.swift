// https://leetcode.com/problems/valid-parentheses/
// Author: Andrew Jarombek
// Date: 2/1/2022

func isValid(_ s: String) -> Bool {
    var items = [String]()
    let pairs = [
        "(": ")",
        "[": "]",
        "{": "}"
    ]

    for c in s {
        if let value = pairs[String(c)] {
            items.append(value)
        } else if items.count > 0 && String(c) == items[items.count - 1] {
            items.removeLast()
        } else {
            return false
        }
    }

    return items.count == 0
}