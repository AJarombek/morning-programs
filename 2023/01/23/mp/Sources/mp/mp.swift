/**
 https://leetcode.com/problems/guess-number-higher-or-lower/
 - Author: Andrew Jarombek
 - Date: 1/23/2023
 */

public class MorningPrograms {
    func guessNumber(_ n: Int) -> Int {
        var low = 1
        var high = n

        while low <= high {
            let mid = (low + high) / 2
            let val = guess(mid)

            if val == 0 {
                return mid
            }

            if val == -1 {
                high = mid - 1
            } else {
                low = mid + 1
            }
        }

        return low
    }

    func guess(_ val: Int) -> Int {
        if val == 6 {
            return 0
        }

        if val > 6 {
            return -1
        } else {
            return 1
        }
    }
}
