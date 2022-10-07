/**
 * https://leetcode.com/problems/day-of-the-week/
 * @author Andrew Jarombek
 * @since 10/7/2022
 */

function dayOfTheWeek(day: number, month: number, year: number): string {
    const date = new Date();
    date.setFullYear(year);
    date.setMonth(month - 1);
    date.setDate(day);

    const days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
    return days[date.getDay()];
}