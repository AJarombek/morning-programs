/**
 * https://leetcode.com/problems/unique-email-addresses/
 * @author Andrew Jarombek
 * @since 5/18/2023
 */

const assert = require('assert');

// replaceAll() not available in older JS versions
String.prototype.replaceAll = function (search, replacement) {
    return this.split(search).join(replacement);
};

const numUniqueEmails = function(emails) {
    const set = new Set();

    for (let email of emails) {
        const [fullLocalName, domainName] = email.split('@');
        let localName = fullLocalName.split('+')[0];
        localName = localName.replaceAll('.', '');

        set.add(`${localName}@${domainName}`);
    }

    return set.size;
};

// Test case 1: Unique emails
let emails1 = [
    "test.email@gmail.com",
    "test.e.mail+john.smith@gmail.com",
    "testemail@gmail.com"
];
assert.strictEqual(numUniqueEmails(emails1), 1, 'Test case 1 failed');

// Test case 2: Duplicate emails
let emails2 = [
    "test.email@gmail.com",
    "test.email@yahoo.com",
    "test.email@gmail.com",
    "test.e.mail+john.smith@gmail.com"
];
assert.strictEqual(numUniqueEmails(emails2), 2, 'Test case 2 failed');
