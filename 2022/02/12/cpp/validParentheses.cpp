// https://leetcode.com/problems/valid-parentheses/
// Author: Andrew Jarombek
// Date: 2/12/2022

#include <string>
#include <stack>
#include <map>
#include <cassert>

using namespace std;

bool isValid(string s) {
    stack<char> closingParens;
    map<char, char> parens = {
            {'(', ')'},
            {'[', ']'},
            {'{', '}'}
    };

    for (int i = 0; i < s.length(); i++) {
        char c = s[i];

        if (parens.find(c) != parens.end()) {
            closingParens.push(parens[c]);
        } else {
            if (closingParens.size() == 0 || c != closingParens.top()) {
                return false;
            }

            closingParens.pop();
        }
    }

    return closingParens.size() == 0;
}

int main() {
    assert(isValid("()"));
    assert(isValid("()[]{}"));
    assert(!isValid("[}"));
}
