/**
 Unit tests for a repeated-substring-pattern program.
 - Author: Andrew Jarombek
 - Date: 6/1/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {
    var morningPrograms: MorningPrograms!

    override func setUp() {
        super.setUp()
        morningPrograms = MorningPrograms()
    }

    override func tearDown() {
        morningPrograms = nil
        super.tearDown()
    }

    func testRepeatedSubstringPattern_PositiveCase() {
        let s = "abcabcabc"
        let result = morningPrograms.repeatedSubstringPattern(s)
        XCTAssertTrue(result)
    }

    func testRepeatedSubstringPattern_NegativeCase() {
        let s = "abcdefg"
        let result = morningPrograms.repeatedSubstringPattern(s)
        XCTAssertFalse(result)
    }
}
