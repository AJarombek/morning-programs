// https://leetcode.com/problems/length-of-last-word/
// Author: Andrew Jarombek
// Date: 2/11/2022

func lengthOfLastWord(_ s: String) -> Int {
    var length = 0
    var word = false

    for i in (0..<s.count).reversed() {
        let c = s[s.index(s.startIndex, offsetBy: i)]

        if c == " " {
            if word {
                return length
            }
        } else {
            word = true
            length += 1
        }
    }

    return length
}

func lengthOfLastWordSlow(_ s: String) -> Int {
    var length = 0
    var space = true

    for i in 0..<s.count {
        let c = s[s.index(s.startIndex, offsetBy: i)]

        if c == " " {
            space = true
        } else {
            if space {
                length = 0
            }

            length += 1
            space = false
        }
    }

    return length
}