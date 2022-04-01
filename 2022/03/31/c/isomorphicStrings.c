// Program: https://leetcode.com/problems/isomorphic-strings/
// Author: Andrew Jarombek
// Date: 3/31/2022

#include <stdbool.h>
#include <string.h>
#include <assert.h>

bool isIsomorphic(char * s, char * t){
    char st[128];
    char ts[128];

    for (int i = 0; i < 128; i++) {
        st[i] = '\0';
        ts[i] = '\0';
    }

    for (int i = 0; i < strlen(s); i++) {
        char c1 = s[i];
        char c2 = t[i];
        char value = st[c1];

        if (value == '\0') {
            st[c1] = c2;

            if (ts[c2] != '\0')
                return false;

            ts[c2] = c1;
        } else if (value != c2) {
            return false;
        }
    }

    return true;
}

int main() {
    assert(isIsomorphic("egg", "add"));
    assert(!isIsomorphic("foo", "bar"));
}
