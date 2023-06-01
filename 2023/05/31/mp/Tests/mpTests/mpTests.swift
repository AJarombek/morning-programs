/**
 Unit tests for a assign-cookies program.
 - Author: Andrew Jarombek
 - Date: 5/31/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {

    func testFindContentChildren() {
        let morningPrograms = MorningPrograms()

        // Test case 1: Expected output 2
        let g1 = [1, 2, 3]
        let s1 = [1, 1]
        XCTAssertEqual(morningPrograms.findContentChildren(g1, s1), 2)

        // Test case 2: Expected output 1
        let g2 = [1, 2]
        let s2 = [1, 2, 3]
        XCTAssertEqual(morningPrograms.findContentChildren(g2, s2), 1)
    }

}
