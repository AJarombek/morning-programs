/**
 * https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/
 * @author Andrew Jarombek
 * @since 3/9/2023
 */

function removeDigitV2(number: string, digit: string): string {
    for (let i = 0; i < number.length; i++) {
        let num = number.charAt(i);

        if (num == digit) {
            let next = number.charAt(i + 1) || '0';

            if (+num < +next) {
                return number.substring(0, i) + number.substring(i + 1, number.length);
            }
        }
    }

    for (let i = number.length - 1; i >= 0; i--) {
        let num = number.charAt(i);

        if (num == digit) {
            return number.substring(0, i) + number.substring(i + 1, number.length);
        }
    }

    return "";
}

function removeDigit(number: string, digit: string): string {
    let result = "";
    let max = 0;

    for (let i = 0; i < number.length; i++) {
        let num = number.charAt(i);

        if (num == digit) {
            const val = number.substring(0, i) + number.substring(i + 1, number.length);

            if (+val > max) {
                result = val;
                max = +val;
            }
        }
    }

    return result;
}