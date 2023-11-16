// https://leetcode.com/problems/word-pattern/
// Author: Andrew Jarombek
// Date: 11/15/2023

#include <cassert>
#include <string>
#include <vector>
#include <sstream>
#include <iterator>
#include <unordered_map>

using namespace std;

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        istringstream iss(s);
        vector<string> words {
            istream_iterator<string>{iss},
            istream_iterator<string>{}
        };

        if (pattern.length() != words.size()) {
            return false;
        }

        unordered_map<char, string> patternMap;
        unordered_map<string, char> wordMap;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern[i];
            string word = words[i];

            if (patternMap.find(c) == patternMap.end() && wordMap.find(word) == wordMap.end()) {
                patternMap[c] = word;
                wordMap[word] = c;
            } else if (patternMap.find(c) == patternMap.end() || wordMap.find(word) == wordMap.end()) {
                return false;
            } else if (patternMap[c] != word || wordMap[word] != c) {
                return false;
            }
        }

        return true;
    }
};

int main() {
    Solution solution;
    assert(solution.wordPattern("abba", "dog cat cat dog"));
    assert(!solution.wordPattern("abba", "dog cat cat fish"));
}
