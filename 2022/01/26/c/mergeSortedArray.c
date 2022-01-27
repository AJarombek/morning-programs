// Program: https://leetcode.com/problems/merge-sorted-array/
// Author: Andrew Jarombek
// Date: 1/26/2022

void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    int index = m + n - 1;
    m--;
    n--;

    while (n >= 0) {
        if (m < 0 || nums1[m] < nums2[n]) {
            nums1[index] = nums2[n];
            n--;
        } else {
            nums1[index] = nums1[m];
            m--;
        }

        index--;
    }
}