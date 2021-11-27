/**
 * https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 * @author Andrew Jarombek
 * @since 11/27/2021
 */

const average = function(salary) {
    let minimum = 1_000_001;
    let maximum = 99;
    let sum = 0;

    for (let num of salary) {
        sum += num;

        if (num > maximum) {
            maximum = num;
        }

        if (num < minimum) {
            minimum = num;
        }
    }

    return (sum - minimum - maximum) / (salary.length - 2)
};
