/**
 Unit tests for a number-complement program.
 - Author: Andrew Jarombek
 - Date: 6/4/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {
    func testFindComplement1() {
        let program = MorningPrograms()
        let num = 5
        let complement = program.findComplement(num)
        XCTAssertEqual(complement, 2)
    }

    func testFindComplement2() {
        let program = MorningPrograms()
        let num = 1
        let complement = program.findComplement(num)
        XCTAssertEqual(complement, 0)
    }
}
