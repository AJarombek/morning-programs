/**
 https://leetcode.com/problems/third-maximum-number/
 - Author: Andrew Jarombek
 - Date: 5/27/2023
 */

public class MorningPrograms {
    func thirdMax(_ nums: [Int]) -> Int {
        var max1: Int? = nil
        var max2: Int? = nil
        var max3: Int? = nil

        for num in nums {
            if max1 == nil || num > max1! {
                max3 = max2
                max2 = max1
                max1 = num
            } else if max2 == nil || num > max2! {
                if num != max1 {
                    max3 = max2
                    max2 = num
                }
            } else if max3 == nil || num > max3! {
                if num != max2 {
                    max3 = num
                }
            }
        }

        if max3 == nil {
            return max1!
        } else {
            return max3!
        }
    }
}
