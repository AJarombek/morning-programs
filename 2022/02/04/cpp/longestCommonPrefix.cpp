// https://leetcode.com/problems/longest-common-prefix/
// Author: Andrew Jarombek
// Date: 2/4/2022

#include <string>
#include <vector>

using namespace std;

string longestCommonPrefix(vector<string>& strs) {
    string prefix = strs[0];

    for (int i = 1; i < strs.size(); i++) {
        string str = strs[i];
        int l = 1;

        if (str.size() < prefix.size()) {
            prefix = prefix.substr(0, str.size());
        }

        while (l <= str.size()) {
            if (prefix.substr(0, l) != str.substr(0, l)) {
                if (l == 1)
                    return "";

                prefix = prefix.substr(0, l - 1);
                l = str.size() + 1;
            } else {
                l++;
            }
        }
    }

    return prefix;
}