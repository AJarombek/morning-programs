/**
 * https://leetcode.com/problems/minimum-index-sum-of-two-lists/
 * @author Andrew Jarombek
 * @since 9/15/2022
 */

const findRestaurant = function(list1, list2) {
    let sum = Infinity;
    let result = [];
    let map = new Map();

    for (let i = 0; i < list1.length; i++) {
        map.set(list1[i], i);
    }

    for (let i = 0; i < list2.length; i++) {
        let item = list2[i];
        let val = i + map.get(item);

        if (val === sum) {
            result.push(item);
        } else if (val < sum) {
            sum = val;
            result = [item];
        }
    }

    return result;
};

let result = findRestaurant(["a", "b", "c"], ["b", "c", "a"]);
let expected = ["b"]
console.assert(expected.every((value, index) => value === result[index]));

result = findRestaurant(["a", "b", "c"], ["b", "a", "c"]);
expected = ["b", "a"]
console.assert(expected.every((value, index) => value === result[index]));
