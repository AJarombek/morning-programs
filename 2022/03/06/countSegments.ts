/**
 * https://leetcode.com/problems/number-of-segments-in-a-string/
 * @author Andrew Jarombek
 * @since 3/6/2022
 */

function countSegments(s: string): number {
    return s.split(" ").filter(str => str.length).length;
}