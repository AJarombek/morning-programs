/**
 Unit tests for a find-the-difference program.
 - Author: Andrew Jarombek
 - Date: 5/21/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {
    let morningPrograms = MorningPrograms()

    func testFindTheDifference() {
        let s1 = "abcd"
        let t1 = "abcde"
        XCTAssertEqual(findTheDifference(s1, t1), "e", "Test case 1 failed")

        let s2 = "aabbcc"
        let t2 = "aabbcce"
        XCTAssertEqual(findTheDifference(s2, t2), "e", "Test case 2 failed")
    }
}
