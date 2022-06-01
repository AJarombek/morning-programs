/**
 * https://leetcode.com/problems/find-the-town-judge/
 * @author Andrew Jarombek
 * @since 5/31/2022
 */

function findJudge(n: number, trust: number[][]): number {
    if (n == 1)
        return 1;

    let set = new Set<number>();
    let map = new Map<number, number>();

    for (let i = 1; i <= n; i++)
        set.add(i);

    for (let [person, trusted] of trust) {
        set.delete(person);
        map.set(trusted, (map.get(trusted) ?? 0) + 1);
    }

    if (set.size) {
        const judge = set.values().next().value;
        return map.get(judge) == n - 1 ? judge: -1;
    } else {
        return -1;
    }
}