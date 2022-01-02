/**
 * https://leetcode.com/problems/two-out-of-three/
 * @author Andrew Jarombek
 * @since 1/2/2022
 */

const twoOutOfThree = function(nums1, nums2, nums3) {
    const map = new Map();

    setMap(nums1, map);
    setMap(nums2, map);
    setMap(nums3, map);

    const result = [];
    for (let [key, value] of map.entries()) {
        if (value >= 2) {
            result.push(key);
        }
    }

    return result;
};

const setMap = function(nums, map) {
    const set = new Set();

    for (let i = 0; i < nums.length; i++) {
        const value = nums[i];

        if (!set.has(value)) {
            map.set(nums[i], (map.get(nums[i]) ?? 0) + 1);
            set.add(nums[i]);
        }
    }
}