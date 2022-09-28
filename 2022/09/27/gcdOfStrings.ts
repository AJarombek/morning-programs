/**
 * https://leetcode.com/problems/greatest-common-divisor-of-strings/
 * @author Andrew Jarombek
 * @since 9/27/2022
 */

function gcdOfStrings(str1: string, str2: string): string {
    let result = str1.length > str2.length ? str2 : str1;

    while (result.length > 0) {
        if (
            str1.length % result.length == 0
            && str2.length % result.length == 0
            && str1 == str1.substring(result.length) + result
            && str2 == str2.substring(result.length) + result
        ) {
            return result;
        }

        result = result.slice(0, result.length - 1);
    }

    return result;
}