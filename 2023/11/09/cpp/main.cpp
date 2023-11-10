// https://leetcode.com/problems/valid-anagram/
// Author: Andrew Jarombek
// Date: 11/9/2023

#include <cassert>
#include <string>

using namespace std;

class Solution {
public:
    bool isAnagram(string s, string t) {
        unsigned long sLength = s.length();
        unsigned long tLength = t.length();

        if (sLength != tLength) {
            return false;
        }

        int sCount[26] = {0};
        int tCount[26] = {0};

        for (int i = 0; i < sLength; i++) {
            sCount[s[i] - 'a']++;
            tCount[t[i] - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (sCount[i] != tCount[i]) {
                return false;
            }
        }

        return true;
    }
};

int main() {
    Solution solution;
    assert(solution.isAnagram("anagram", "nagaram"));
    assert(!solution.isAnagram("rat", "car"));
}
