/**
 https://leetcode.com/problems/add-strings/
 - Author: Andrew Jarombek
 - Date: 5/28/2023
 */

public class MorningPrograms {
    func addStrings(_ num1: String, _ num2: String) -> String {
        let x = Int64(num1)!
        let y = Int64(num2)!

        let result = x + y
        return String(result)
    }

    func addStringsV2(_ num1: String, _ num2: String) -> String {
        var result = ""
        var carry = 0

        var i = num1.count - 1
        var j = num2.count - 1

        while i >= 0 || j >= 0 || carry > 0 {
            let digit1 = i >= 0 ? Int(String(num1[num1.index(num1.startIndex, offsetBy: i)])) ?? 0 : 0
            let digit2 = j >= 0 ? Int(String(num2[num2.index(num2.startIndex, offsetBy: j)])) ?? 0 : 0

            let sum = digit1 + digit2 + carry
            result = String(sum % 10) + result
            carry = sum / 10

            i -= 1
            j -= 1
        }

        return result
    }
}
