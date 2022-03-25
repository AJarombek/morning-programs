/**
 * https://leetcode.com/problems/license-key-formatting/
 * @author Andrew Jarombek
 * @since 3/24/2022
 */

function findWords(words: string[]): string[] {
    const keyRow = {
        a: 2,
        b: 3,
        c: 3,
        d: 2,
        e: 1,
        f: 2,
        g: 2,
        h: 2,
        i: 1,
        j: 2,
        k: 2,
        l: 2,
        m: 3,
        n: 3,
        o: 1,
        p: 1,
        q: 1,
        r: 1,
        s: 2,
        t: 1,
        u: 1,
        v: 3,
        w: 1,
        x: 3,
        y: 1,
        z: 3
    }

    const result = [];

    for (let word of words) {
        let row = keyRow[word.charAt(0).toLowerCase()];
        let mismatch = false;
        let index = 1;

        while (!mismatch && index < word.length) {
            if (keyRow[word.charAt(index).toLowerCase()] != row) {
                mismatch = true;
            }

            index++;
        }

        if (!mismatch) {
            result.push(word);
        }
    }

    return result;
}
