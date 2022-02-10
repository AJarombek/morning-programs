// https://leetcode.com/problems/merge-sorted-array/
// Author: Andrew Jarombek
// Date: 2/9/2022

pub fn merge(nums1: &mut Vec<i32>, m: i32, nums2: &mut Vec<i32>, n: i32) {
    let mut i: i32 = m - 1;
    let mut j: i32 = n - 1;
    let mut index = nums1.len() - 1;

    while i >= 0 && j >= 0 {
        let n1 = nums1[i as usize];
        let n2 = nums2[j as usize];

        if n1 > n2 {
            nums1[index] = n1;
            i -= 1;
        } else {
            nums1[index] = n2;
            j -= 1;
        }

        index -= 1;
    }

    while j >= 0 {
        nums1[index] = nums2[j as usize];
        j -= 1;
        index -= 1;
    }
}

fn main() {
    let vec1 = &mut vec![1,2,3,0,0,0];
    let vec2 = &mut vec![2,5,6];
    merge(vec1, 3, vec2, 3);

    assert_eq!(vec1, &mut vec![1,2,2,3,5,6]);
}
