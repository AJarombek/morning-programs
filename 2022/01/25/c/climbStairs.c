// Program: https://leetcode.com/problems/climbing-stairs/
// Author: Andrew Jarombek
// Date: 1/25/2022

int climbStairs(int n){
    if (n < 4) {
        return n;
    }

    int x = 2;
    int y = 3;

    for (int i = 4; i <= n; i++) {
        int z = x + y;
        x = y;
        y = z;
    }

    return y;
}