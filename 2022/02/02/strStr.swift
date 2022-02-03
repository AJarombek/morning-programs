// https://leetcode.com/problems/implement-strstr/
// Author: Andrew Jarombek
// Date: 2/2/2022

func strStr(_ haystack: String, _ needle: String) -> Int {
    if needle.count == 0 {
        return 0
    }

    var offset = 0

    let haystackArray = Array(haystack)
    let needleArray = Array(needle)

    while offset <= haystack.count - needle.count {
        var matches = true

        for i in 0..<needle.count {
            if haystackArray[offset + i] != needleArray[i] {
                matches = false
            }
        }

        if matches {
            return offset
        }

        offset += 1
    }

    return -1
}

func strStr1(_ haystack: String, _ needle: String) -> Int {
    if needle.count == 0 {
        return 0
    }

    var index = 0

    while index <= haystack.count - needle.count {
        let start = haystack.index(haystack.startIndex, offsetBy: index)
        let end = haystack.index(haystack.startIndex, offsetBy: index + needle.count)

        if needle == String(haystack[start..<end]) {
            return index
        }

        index += 1
    }

    return -1
}