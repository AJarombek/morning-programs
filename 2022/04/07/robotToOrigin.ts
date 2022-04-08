/**
 * https://leetcode.com/problems/robot-return-to-origin/
 * @author Andrew Jarombek
 * @since 4/7/2022
 */

function judgeCircle(moves: string): boolean {
    let x = 0;
    let y = 0;

    for (let move of moves) {
        switch (move) {
            case "U":
                y++;
                break;
            case "D":
                y--;
                break;
            case "L":
                x--;
                break;
            case "R":
                x++;
        }
    }

    return x == 0 && y == 0;
}