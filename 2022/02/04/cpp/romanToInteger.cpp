// https://leetcode.com/problems/roman-to-integer/
// Author: Andrew Jarombek
// Date: 2/4/2022

#include <cassert>
#include <string>
#include <map>

using namespace std;

int romanToInt(string s) {
    map<string, int> values {
            {"I", 1},
            {"IV", 4},
            {"V", 5},
            {"IX", 9},
            {"X", 10},
            {"XL", 40},
            {"L", 50},
            {"XC", 90},
            {"C", 100},
            {"CD", 400},
            {"D", 500},
            {"CM", 900},
            {"M", 1000}
    };

    int index = 0;
    int value = 0;

    while (index < s.size()) {
        if (index + 1 < s.size() && values.find(s.substr(index, 2)) != values.end()) {
            value += values[s.substr(index, 2)];
            index += 2;
        } else {
            value += values[s.substr(index, 1)];
            index++;
        }
    }

    return value;
}

int main() {
    assert(romanToInt("I") == 1);
    assert(romanToInt("II") == 2);
    assert(romanToInt("III") == 3);
    assert(romanToInt("IV") == 4);
    assert(romanToInt("V") == 5);
}