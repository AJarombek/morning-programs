// https://leetcode.com/problems/implement-strstr/
// Author: Andrew Jarombek
// Date: 2/13/2022

#include <string>
#include <iostream>
#include <cassert>

#include "searchInsertPosition.h"
#include "maxSubArray.h"
#include "lengthOfLastWord.h"

using namespace std;

int strStr(string haystack, string needle) {
    if (needle.length() == 0) {
        return 0;
    }

    if (haystack.length() < needle.length()) {
        return -1;
    }

    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
        cout << haystack.substr(i, needle.length()) << "\n";

        if (needle == haystack.substr(i, needle.length())) {
            return i;
        }
    }

    return -1;
}

int main() {
    assert(strStr("hello", "ll") == 2);
    assert(strStr("", "") == 0);

    vector<int> v {1, 3, 5, 7};
    assert(searchInsert(v, 2) == 1);

    vector<int> vec {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    assert(maxSubArray(vec) == 6);

    assert(lengthOfLastWord("Hello World") == 5);
}
