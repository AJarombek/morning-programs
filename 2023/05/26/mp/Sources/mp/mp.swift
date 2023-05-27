/**
 https://leetcode.com/problems/fizz-buzz/
 - Author: Andrew Jarombek
 - Date: 5/26/2023
 */

public class MorningPrograms {
    func fizzBuzz(_ n: Int) -> [String] {
        var result:[String] = []

        for i in 1...n {
            if i % 3 == 0 && i % 5 == 0 {
                result.append("FizzBuzz")
            } else if i % 3 == 0 {
                result.append("Fizz")
            } else if i % 5 == 0 {
                result.append("Buzz")
            } else {
                result.append(String(i))
            }
        }

        return result
    }
}
