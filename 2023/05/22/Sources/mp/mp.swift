/**
 https://leetcode.com/problems/is-subsequence/
 - Author: Andrew Jarombek
 - Date: 5/22/2023
 */

public class MorningPrograms {
    func isSubsequence(_ s: String, _ t: String) -> Bool {
        var i = 0
        var j = 0

        var sIndex = s.index(s.startIndex, offsetBy: 0)
        var tIndex = t.index(t.startIndex, offsetBy: 0)

        while i < s.count && j < t.count {
            if s[sIndex] == t[tIndex] {
                i += 1
                sIndex = s.index(s.startIndex, offsetBy: i)
            }

            j += 1
            tIndex = t.index(t.startIndex, offsetBy: j)
        }

        print(i)
        return i == s.count
    }
}
