/**
 * https://leetcode.com/problems/best-poker-hand/
 * @author Andrew Jarombek
 * @since 3/17/2023
 */

function bestHand(ranks: number[], suits: string[]): string {
    const rankMap = new Map<number, number>();
    let maxVal = 0;

    const suitSet = new Set<string>(suits);

    for (let rank of ranks) {
        const val = (rankMap.get(rank) ?? 0) + 1;
        rankMap.set(rank, val);

        maxVal = Math.max(val, maxVal);
    }

    if (suitSet.size == 1) {
        return "Flush";
    }

    if (maxVal >= 3) {
        return "Three of a Kind";
    }

    if (maxVal == 2) {
        return "Pair";
    }

    return "High Card";
}