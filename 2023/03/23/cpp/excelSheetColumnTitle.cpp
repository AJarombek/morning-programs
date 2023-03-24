// https://leetcode.com/problems/excel-sheet-column-title/
// Author: Andrew Jarombek
// Date: 3/23/2023

#include <cassert>
#include <string>

using namespace std;

string convertToTitle(int columnNumber) {
    string result = "";

    while (columnNumber > 0) {
        result = char(65 + (columnNumber - 1) % 26) + result;
        columnNumber = (columnNumber - 1) / 26;
    }

    return result;
}

int main() {
    assert(convertToTitle(1) == "A");
    assert(convertToTitle(28) == "AB");
    assert(convertToTitle(701) == "ZY");
}