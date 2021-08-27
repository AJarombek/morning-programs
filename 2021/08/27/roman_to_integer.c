// Program: https://leetcode.com/problems/roman-to-integer/
// Author: Andrew Jarombek
// Date: 8/27/2021

#include <assert.h>

int romanToInt(char* s) {
    int result = 0;

    while (*s != '\0') {
        if (*s == 'M') {
            result += 1000;
            s++;
        } else if (*s == 'D') {
            result += 500;
            s++;
        } else if (*s == 'C') {
            char* next = s;
            next++;

            if (*next == 'M') {
                result += 900;
                s += 2;
            } else if (*next == 'D') {
                result += 400;
                s += 2;
            } else {
                result += 100;
                s++;
            }
        } else if (*s == 'L') {
            result += 50;
            s++;
        } else if (*s == 'X') {
            char* next = s;
            next++;

            if (*next == 'C') {
                result += 90;
                s += 2;
            } else if (*next == 'L') {
                result += 40;
                s += 2;
            } else {
                result += 10;
                s++;
            }
        } else if (*s == 'V') {
            result += 5;
            s++;
        } else if (*s == 'I') {
            char* next = s;
            next++;

            if (*next == 'V') {
                result += 4;
                s += 2;
            } else if (*next == 'X') {
                result += 9;
                s += 2;
            } else {
                result += 1;
                s++;
            }
        }
    }

    return result;
}

int main() {
    int result = romanToInt("XIV");
    assert(result == 14);
}
