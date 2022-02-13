// https://leetcode.com/problems/length-of-last-word/
// Author: Andrew Jarombek
// Date: 2/13/2022

#include "lengthOfLastWord.h"
#include <string>

using namespace std;

int lengthOfLastWord(string s) {
    int length = 0;
    int index = s.length() - 1;
    bool word = false;

    while (index >= 0) {
        if (s[index] == ' ') {
            if (word)
                return length;
        } else {
            word = true;
            length++;
        }

        index--;
    }

    return length;
}