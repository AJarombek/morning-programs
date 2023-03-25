// https://leetcode.com/problems/excel-sheet-column-number/
// Author: Andrew Jarombek
// Date: 3/25/2023

#include <cassert>
#include <string>

using namespace std;

int titleToNumberV2(string columnTitle) {
    int result = 0;

    for (char i : columnTitle) {
        result *= 26;
        result += int(i) - 65 + 1;
    }

    return result;
}

int titleToNumber(string columnTitle) {
    int result = 0;

    for (int i = 0; i < columnTitle.size(); i++) {
        result *= 26;
        result += int(columnTitle[i]) - 65 + 1;
    }

    return result;
}

int main() {
    assert(titleToNumber("A") == 1);
    assert(titleToNumber("AB") == 28);
    assert(titleToNumberV2("ZY") == 701);
}