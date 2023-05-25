/**
 https://leetcode.com/problems/convert-a-number-to-hexadecimal/
 - Author: Andrew Jarombek
 - Date: 5/24/2023
 */

import Foundation

public class MorningPrograms {
    func toHex(_ num: Int) -> String {
        var num = num

        if num == 0 {
            return "0"
        }

        if num < 0 {
            let maxValue: Double = pow(2, 32)
            num = Int(maxValue) + num
        }

        var result = ""

        while num > 0 {
            let hex = num & 15

            if hex > 9 {
                result = String(Character(UnicodeScalar(hex + 87)!)) + result
            } else {
                result = String(hex) + result
            }

            num = num >> 4
        }

        return result
    }
}
