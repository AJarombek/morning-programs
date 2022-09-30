/**
 * https://leetcode.com/problems/defanging-an-ip-address/
 * @author Andrew Jarombek
 * @since 9/29/2022
 */

function defangIPaddr(address: string): string {
    const arr = address.split("");

    for (let i = 0; i < arr.length; i++) {
        const c = arr[i];

        if (c == '.') {
            arr[i] = '[.]';
        }
    }

    return arr.join("");
}