/**
 * https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/
 * @author Andrew Jarombek
 * @since 3/12/2023
 */


function digitCount(num: string): boolean {
    let map = new Map<string, number>();

    for (let c of num) {
        map.set(c, (map.get(c) ?? 0) + 1);
    }

    for (let i = 0; i < num.length; i++) {
        let c = num.charAt(i);
        if (+c != (map.get(`${i}`) ?? 0)) {
            return false;
        }
    }

    return true;
}