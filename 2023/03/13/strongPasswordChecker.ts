/**
 * https://leetcode.com/problems/strong-password-checker-ii/
 * @author Andrew Jarombek
 * @since 3/13/2023
 */

function strongPasswordCheckerII(password: string): boolean {
    if (password.length < 8) {
        return false;
    }

    const specialChars = new Set<string>([
        "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+"
    ]);

    let lowercaseLetters = 0;
    let uppercaseLetters = 0;
    let digits = 0;
    let special = 0;
    let prev = "";

    for (let c of password) {
        if (c == prev) {
            return false;
        } else if (c >= 'a' && c <= 'z') {
            lowercaseLetters++;
        } else if (c >= 'A' && c <= 'Z') {
            uppercaseLetters++;
        } else if (c >= '0' && c <= '9') {
            digits++;
        } else if (specialChars.has(c)) {
            special++;
        }

        prev = c;
    }

    return lowercaseLetters > 0 && uppercaseLetters > 0 && digits > 0 && special > 0;
}