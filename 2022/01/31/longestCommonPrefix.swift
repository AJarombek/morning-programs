// https://leetcode.com/problems/longest-common-prefix/
// Author: Andrew Jarombek
// Date: 1/31/2022

func longestCommonPrefix(_ strs: [String]) -> String {
    var prefix = strs[0]

    for index in 1..<strs.count {
        let str = strs[index]

        for end in stride(from: min(str.count, prefix.count), to: -1, by: -1) {
            if end == 0 {
                return ""
            }

            let strIndex = str.index(str.startIndex, offsetBy: end)
            let prefixIndex = prefix.index(prefix.startIndex, offsetBy: end)

            if (str[str.startIndex..<strIndex] == prefix[prefix.startIndex..<prefixIndex]) {
                prefix = String(str[str.startIndex..<strIndex])
                break
            }
        }
    }

    return prefix
}