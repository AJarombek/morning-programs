// https://leetcode.com/problems/add-binary/
// Author: Andrew Jarombek
// Date: 4/8/2022

#include <cassert>
#include <string>
#include <stack>

using namespace std;

string addBinary(string a, string b) {
    stack<string> digits;
    int remainder = 0;

    int i = a.length() - 1;
    int j = b.length() - 1;

    while (i >= 0 || j >= 0) {
        int x = i >= 0 ? a[i] - '0' : 0;
        int y = j >= 0 ? b[j] - '0' : 0;
        int val = x + y + remainder;

        remainder = val > 1 ? 1 : 0;
        digits.push(val % 2 == 0 ? "0" : "1");

        i--;
        j--;
    }

    if (remainder > 0) {
        digits.push("1");
    }

    string result;
    while (digits.size() > 0) {
        result += digits.top();
        digits.pop();
    }

    return result;
}

int main() {
    assert(addBinary("1010", "1011") == "10101");
}