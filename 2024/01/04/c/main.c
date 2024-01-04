// Program: https://leetcode.com/problems/assign-cookies/
// Author: Andrew Jarombek
// Date: 1/4/2024

#include <assert.h>
#include <stdlib.h>

int findContentChildren(int* g, int gSize, int* s, int sSize) {
    int satisfied = 0;

    // Sort the arrays in ascending order
    for (int i = 0; i < gSize; i++) {
        for (int j = i + 1; j < gSize; j++) {
            if (g[i] > g[j]) {
                int temp = g[i];
                g[i] = g[j];
                g[j] = temp;
            }
        }
    }

    for (int i = 0; i < sSize; i++) {
        for (int j = i + 1; j < sSize; j++) {
            if (s[i] > s[j]) {
                int temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
        }
    }

    int gIndex = 0;
    int sIndex = 0;

    while (gIndex < gSize && sIndex < sSize) {
        if (s[sIndex] >= g[gIndex]) {
            satisfied++;
            gIndex++;
            sIndex++;
        } else {
            sIndex++;
        }
    }

    return satisfied;
}

int main() {
    int g1[] = {1,2,3};
    int s1[] = {1,1};
    assert(findContentChildren(g1, 3, s1, 2) == 1);

    int g2[] = {1,2};
    int s2[] = {1,2,3};
    assert(findContentChildren(g2, 2, s2, 3) == 2);

    return 0;
}