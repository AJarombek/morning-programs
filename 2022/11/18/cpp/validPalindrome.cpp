// https://leetcode.com/problems/valid-palindrome/
// Author: Andrew Jarombek
// Date: 11/18/2022

#include <cassert>
#include <vector>
#include <string>

using namespace std;

// I hope to be a calming and relaxing presence, and to be extremely understanding and gentle towards any challenges
// you are facing.  I still hope for and haven’t given up on you trusting yourself with love and trusting me with love,
// if that is something you still want.

bool isPalindrome(string s) {
    int start = 0;
    int end = s.size() - 1;
    bool result = true;

    while (start < end) {
        char a = tolower(s[start]);

        while (start < end && (a < 'a' || a > 'z') && (a < '0' || a > '9')) {
            start++;
            a = tolower(s[start]);
        }

        char b = tolower(s[end]);

        while (start < end && (b < 'a' || b > 'z') && (b < '0' || b > '9')) {
            end--;
            b = tolower(s[end]);
        }

        if (a != b)
            return false;

        start++;
        end--;
    }

    return true;
}

int main() {
    assert(!isPalindrome("race a car"));
    assert(isPalindrome("race car"));
}