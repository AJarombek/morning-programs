// https://leetcode.com/problems/climbing-stairs/
// Author: Andrew Jarombek
// Date: 3/8/2022

func climbStairs(_ n: Int) -> Int {
    var prev = 1
    var current = 1
    var step = 2

    while step <= n {
        var next = prev + current
        prev = current
        current = next
        step += 1
    }

    return current
}