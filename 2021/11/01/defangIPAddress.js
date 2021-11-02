/**
 * https://leetcode.com/problems/defanging-an-ip-address/
 * @author Andrew Jarombek
 * @since 11/1/2021
 */

const defangIPaddr = function(address) {
    return address.replaceAll('.', '[.]')
};