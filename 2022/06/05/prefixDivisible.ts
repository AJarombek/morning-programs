/**
 * https://leetcode.com/problems/binary-prefix-divisible-by-5/
 * @author Andrew Jarombek
 * @since 6/5/2022
 */

function prefixesDivBy5(nums: number[]): boolean[] {
    let num = BigInt(0);
    let result: boolean[] = [];

    for (let i = 0; i < nums.length; i++) {
        num += BigInt(nums[i]);
        result.push(BigInt(num) % BigInt(5) == BigInt(0));

        num <<= BigInt(1);
    }

    return result;
}

function prefixesDivBy5V2(nums: number[]): boolean[] {
    let num = 0;
    let result: boolean[] = [];

    for (let i = 0; i < nums.length; i++) {
        num = (num + nums[i]) % 5;
        result.push(num % 5 == 0);

        num <<= 1;
    }

    return result;
}