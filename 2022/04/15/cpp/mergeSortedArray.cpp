// https://leetcode.com/problems/merge-sorted-array/
// Author: Andrew Jarombek
// Date: 4/15/2022

#include <cassert>
#include <vector>

using namespace std;

void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
    int i = m - 1;
    int j = n - 1;
    int index = m + n - 1;

    while (index >= 0) {
        int x = i >= 0 ? nums1[i] : INT_MIN;
        int y = j >= 0 ? nums2[j] : INT_MIN;

        if (x > y) {
            nums1[index] = x;
            i--;
        } else {
            nums1[index] = y;
            j--;
        }

        index--;
    }
}

int main() {
    vector v1 {1, 2, 3, 0, 0, 0};
    vector v2 {2, 5, 6};
    merge(v1, 3, v2, 3);

    assert(v1[0] == 1);
    assert(v1[1] == 2);
    assert(v1[2] == 2);
    assert(v1[3] == 3);
    assert(v1[4] == 5);
    assert(v1[5] == 6);
}