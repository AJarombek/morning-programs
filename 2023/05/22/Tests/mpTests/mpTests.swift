/**
 Unit tests for a is-subsequence program.
 - Author: Andrew Jarombek
 - Date: 5/22/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {
    let morningPrograms = MorningPrograms()

    func testIsSubsequence() {
        let s1 = "abc"
        let t1 = "ahbgdc"
        XCTAssertTrue(isSubsequence(s1, t1), "Test case 1 failed")

        let s2 = "axc"
        let t2 = "ahbgdc"
        XCTAssertFalse(isSubsequence(s2, t2), "Test case 2 failed")
    }
}
