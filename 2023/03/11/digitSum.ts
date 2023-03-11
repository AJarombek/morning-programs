/**
 * https://leetcode.com/problems/calculate-digit-sum-of-a-string/
 * @author Andrew Jarombek
 * @since 3/11/2023
 */

function digitSum(s: string, k: number): string {
    while (s.length > k) {
        let newString = "";
        let index = 0;

        while (index < s.length) {
            let val = 0;

            for (let i = index; i < Math.min(index + k, s.length); i++) {
                val += +s.charAt(i);
            }

            index += k;
            newString += `${val}`;
        }

        s = newString;
    }

    return s;
}