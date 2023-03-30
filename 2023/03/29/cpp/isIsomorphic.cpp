// https://leetcode.com/problems/isomorphic-strings/
// Author: Andrew Jarombek
// Date: 3/29/2023

#include <cassert>
#include <string>
#include <unordered_map>
#include <set>

using namespace std;

bool isIsomorphic(string s, string t) {
    if (s.size() != t.size())
        return false;

    unordered_map<char, char> sMap {};
    unordered_map<char, char> tMap {};
    set<char> sSet {};
    set<char> tSet {};

    for (int i = 0; i < s.size(); i++) {
        char cs = s[i];
        char ct = t[i];

        if (sSet.find(cs) != sSet.end() && sMap[cs] != ct) {
            return false;
        }

        if (tSet.find(ct) != tSet.end() && tMap[ct] != cs) {
            return false;
        }

        sMap[cs] = ct;
        tMap[ct] = cs;
        sSet.insert(cs);
        tSet.insert(ct);
    }

    return true;
}

int main() {
    assert(isIsomorphic("egg", "add"));
    assert(!isIsomorphic("foo", "bar"));
}