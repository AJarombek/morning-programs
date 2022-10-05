/**
 * https://leetcode.com/problems/reformat-date/
 * @author Andrew Jarombek
 * @since 10/5/2022
 */

function reformatDate(date: string): string {
    const months = {
        "Jan": "01",
        "Feb": "02",
        "Mar": "03",
        "Apr": "04",
        "May": "05",
        "Jun": "06",
        "Jul": "07",
        "Aug": "08",
        "Sep": "09",
        "Oct": "10",
        "Nov": "11",
        "Dec": "12"
    };

    const [day, month, year] = date.split(" ");
    let formattedDay = day.substring(0, day.length - 2);

    if (formattedDay.length == 1)
        formattedDay = `0${formattedDay}`;

    return `${year}-${months[month]}-${formattedDay}`;
}
