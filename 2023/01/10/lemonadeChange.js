/**
 * https://leetcode.com/problems/lemonade-change/
 * @author Andrew Jarombek
 * @since 1/10/2023
 */

const lemonadeChange = function(bills) {
    let five = 0;
    let ten = 0;

    for (let bill of bills) {
        if (bill === 5) {
            five++;
        } else if (bill === 10) {
            if (five === 0)
                return false;

            five--;
            ten++;
        } else {
            if (five === 0 || ten === 0)
                return false;

            five--;
            ten--;
        }
    }

    return true;
}

console.assert(lemonadeChange([5,5,5,10,20]));
console.assert(!lemonadeChange([5,5,10,10,20]));
