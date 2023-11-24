// https://leetcode.com/problems/reverse-vowels-of-a-string/
// Author: Andrew Jarombek
// Date: 11/22/2023

#include <cassert>
#include <string>
#include <set>

using namespace std;

class Solution {
public:
    static string reverseVowels(string s) {
        set<char> vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        int start = 0;
        int end = s.size() - 1;

        while (start < end) {
            // If s[start] is not a vowel, increment start.
            if (vowels.find(s[start]) == vowels.end()) {
                start++;
            }

                // If s[end] is not a vowel, decrement end.
            else if (vowels.find(s[end]) == vowels.end()) {
                end--;
            }

                // If s[start] and s[end] are vowels, swap them.
            else {
                char temp = s[start];
                s[start] = s[end];
                s[end] = temp;

                start++;
                end--;
            }
        }

        return s;
    }
};

int main() {
    auto result = Solution::reverseVowels("hello");
    assert(result == "holle");

    return 0;
}
