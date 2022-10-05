/**
 * https://leetcode.com/problems/number-of-days-between-two-dates/
 * @author Andrew Jarombek
 * @since 10/5/2022
 */

function daysBetweenDates(date1: string, date2: string): number {
    const time1 = Math.floor(new Date(date1).getTime() / 1000);
    const time2 = Math.floor(new Date(date2).getTime() / 1000);
    return Math.abs(time1 - time2) / (3600 * 24);
}
