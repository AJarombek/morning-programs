/**
 https://leetcode.com/problems/intersection-of-two-arrays-ii/
 https://leetcode.com/problems/valid-perfect-square/
 - Author: Andrew Jarombek
 - Date: 1/22/2023
 */

public class MorningPrograms {
    func intersect(_ nums1: [Int], _ nums2: [Int]) -> [Int] {
        var map: [Int:Int] = [:]

        for num in nums1 {
            map[num] = (map[num] ?? 0) + 1
        }

        var result: [Int] = []

        for num in nums2 {
            if let val = map[num] {
                result.append(num)

                if val == 1 {
                    map.removeValue(forKey: num)
                } else {
                    map[num] = val - 1
                }
            }
        }

        return result
    }

    func isPerfectSquare(_ num: Int) -> Bool {
        var low = 1
        var high = num

        while low <= high {
            let mid = (high + low) / 2
            let val = mid * mid

            if val == num {
                return true
            }

            if val < num {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }

        return false
    }
}
