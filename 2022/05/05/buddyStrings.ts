/**
 * https://leetcode.com/problems/buddy-strings/
 * @author Andrew Jarombek
 * @since 5/5/2022
 */

function buddyStrings(s: string, goal: string): boolean {
    if (s.length != goal.length) {
        return false;
    }

    if (s == goal) {
        let set = new Set<string>();

        for (let c of s) {
            if (set.has(c))
                return true;

            set.add(c);
        }

        return false;
    } else {
        let mismatch = 0;
        let a: string | null = null;
        let b: string | null = null;

        for (let i = 0; i < s.length; i++) {
            let c1 = s.charAt(i);
            let c2 = goal.charAt(i);

            if (c1 != c2) {
                if (mismatch == 2) {
                    return false;
                } else if (mismatch == 1) {
                    if (c1 != b || c2 != a) {
                        return false;
                    }
                } else {
                    a = c1;
                    b = c2;
                }

                mismatch++;
            }
        }

        return mismatch % 2 == 0;
    }
}