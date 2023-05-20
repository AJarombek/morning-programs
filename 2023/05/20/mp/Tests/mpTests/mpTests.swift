/**
 Unit tests for a first-unique-character-in-a-string program.
 - Author: Andrew Jarombek
 - Date: 5/20/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {
    let morningPrograms = MorningPrograms()

    func testFirstUniqChar() {
        let s1 = "aabccdef"
        XCTAssertEqual(morningPrograms.firstUniqChar(s1), 2, "Test case 1 failed")

        let s2 = "xyzxyzabc"
        XCTAssertEqual(morningPrograms.firstUniqChar(s2), 6, "Test case 2 failed")
    }
}
