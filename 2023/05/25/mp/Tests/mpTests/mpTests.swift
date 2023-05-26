/**
 Unit tests for a convert-a-number-to-hexadecimal program.
 - Author: Andrew Jarombek
 - Date: 5/25/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {

    func testLongestPalindrome() {
        let program = MorningPrograms()
        var input = "aabbcdd"
        var result = program.longestPalindrome(input)

        XCTAssertEqual(result, 7, "Expected longest palindrome length to be 7")

        input = "aabbcddcc"
        result = program.longestPalindrome(input)

        XCTAssertEqual(result, 9, "Expected longest palindrome length to be 9")
    }
}
