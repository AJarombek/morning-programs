/**
 * https://leetcode.com/problems/day-of-the-year/
 * @author Andrew Jarombek
 * @since 10/3/2022
 */

function dayOfYear(date: string): number {
    let [year, month, day] = date.split("-").map(x => +x);
    let feb = year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0) ? 29 : 28;

    let days = [31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

    let result = day;

    for (let i = 1; i < month; i++) {
        result += days[i-1];
    }

    return result;
}