// https://leetcode.com/problems/find-the-difference/
// Author: Andrew Jarombek
// Date: 12/5/2023

#include <cassert>
#include <string>
#include <set>

using namespace std;

class Solution {
public:
    static char findTheDifference(string s, string t) {
        int sum = 0;

        for (char c : t) {
            sum += c;
        }

        for (char c : s) {
            sum -= c;
        }

        return (char) sum;
    }

    static char findTheDifferenceV2(string s, string t) {
        multiset<char> set;

        for (char c: s) {
            set.insert(c);
        }

        for (char c: t) {
            auto it = set.find(c);

            if (it != set.end()) {
                set.erase(it);
            } else {
                return c;
            }
        }

        return ' ';
    }
};

int main() {
    assert(Solution::findTheDifference("abcd", "abcde") == 'e');
    assert(Solution::findTheDifference("", "y") == 'y');

    assert(Solution::findTheDifferenceV2("abcd", "abcde") == 'e');
    assert(Solution::findTheDifferenceV2("", "y") == 'y');
    return 0;
}
