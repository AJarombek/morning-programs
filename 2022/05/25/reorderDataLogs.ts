/**
 * https://leetcode.com/problems/reorder-data-in-log-files/
 * @author Andrew Jarombek
 * @since 5/25/2022
 */

const numberRegex = /[0-9]+/;

function reorderLogFiles(logs: string[]): string[] {
    let digitLogs = [];
    let letterLogs = [];

    for (let log of logs) {
        const words = log.split(" ");

        if (numberRegex.test(words[1])) {
            digitLogs.push(log);
        } else {
            letterLogs.push(log);
        }
    }

    letterLogs.sort(compare);
    return letterLogs.concat(digitLogs);
}

function compare(a: string, b: string): number {
    const aId = a.split(" ", 1)[0];
    const bId = b.split(" ", 1)[0];

    const aContent = a.substring(aId.length);
    const bContent = b.substring(bId.length);

    if (aContent > bContent) {
        return 1;
    } else if (aContent < bContent) {
        return -1;
    } else {
        return aId > bId ? 1 : -1;
    }
}
