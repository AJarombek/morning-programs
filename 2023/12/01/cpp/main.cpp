// https://leetcode.com/problems/first-unique-character-in-a-string/
// Author: Andrew Jarombek
// Date: 12/1/2023

#include <cassert>
#include <string>
#include <unordered_map>

using namespace std;

class Solution {
public:
    static int firstUniqChar(string s) {
        unordered_map<char, int> charMap;

        for (char c : s) {
            if (charMap.find(c) == charMap.end()) {
                charMap[c] = 1;
            } else {
                charMap[c]++;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (charMap[s[i]] == 1) {
                return i;
            }
        }

        return -1;
    }
};

int main() {
    assert(Solution::firstUniqChar("leetcode") == 0);
    assert(Solution::firstUniqChar("loveleetcode") == 2);
    assert(Solution::firstUniqChar("aabb") == -1);
    return 0;
}
