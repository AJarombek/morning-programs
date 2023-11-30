// https://leetcode.com/problems/ransom-note/
// Author: Andrew Jarombek
// Date: 11/30/2023

#include <cassert>
#include <string>
#include <unordered_map>

using namespace std;

class Solution {
public:
    static bool canConstruct(string ransomNote, string magazine) {
        auto map = unordered_map<char, int>();

        for (char c : magazine) {
            if (map.find(c) == map.end()) {
                map[c] = 1;
            } else {
                map[c]++;
            }
        }

        for (char c : ransomNote) {
            if (map.find(c) == map.end()) {
                return false;
            } else {
                map[c]--;

                if (map[c] == 0) {
                    map.erase(c);
                }
            }
        }

        return true;
    }
};

int main() {
    assert(Solution::canConstruct("a", "b") == false);
    assert(Solution::canConstruct("aa", "ab") == false);
    return 0;
}
