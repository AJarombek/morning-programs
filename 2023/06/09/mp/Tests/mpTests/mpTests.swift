/**
 Unit tests for a keyboard-row program.
 - Author: Andrew Jarombek
 - Date: 6/9/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {
    func testFindWords1() {
        let program = MorningPrograms()
        let words = ["cat", "dog", "top"]
        let result = program.findWords(words)
        let expected = ["top"]
        XCTAssertEqual(result, expected)
    }

    func testFindWords2() {
        let program = MorningPrograms()
        let words = ["car", "book", "tree"]
        let result = program.findWords(words)
        let expected: [String] = ["tree"]
        XCTAssertEqual(result, expected)
    }
}
