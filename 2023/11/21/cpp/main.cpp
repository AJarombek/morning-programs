// https://leetcode.com/problems/reverse-string/
// Author: Andrew Jarombek
// Date: 11/21/2023

#include <cassert>
#include <vector>

using namespace std;

class Solution {
public:
    static void reverseString(vector<char>& s) {
        int start = 0;
        int end = s.size() - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
};

int main() {
    vector<char> s = {'h','e','l','l','o'};
    Solution::reverseString(s);
    assert(s == vector<char>({'o','l','l','e','h'}));
}
