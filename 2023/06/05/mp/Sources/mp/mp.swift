/**
 https://leetcode.com/problems/license-key-formatting/
 - Author: Andrew Jarombek
 - Date: 6/5/2023
 */

public class MorningPrograms {
    func licenseKeyFormatting(_ s: String, _ k: Int) -> String {
        var result = ""
        var count = 0

        for char in s.reversed() {
            if char != "-" {
                result.append(char.uppercased())
                count += 1

                if count == k {
                    result.append("-")
                    count = 0
                }
            }
        }

        if result.last == "-" {
            result.removeLast()
        }

        return String(result.reversed())
    }
}
