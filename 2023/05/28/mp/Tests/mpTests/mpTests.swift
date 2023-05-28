/**
 Unit tests for a add-strings program.
 - Author: Andrew Jarombek
 - Date: 5/28/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {

    func testAddStrings() {
        let morningPrograms = MorningPrograms()

        XCTAssertEqual(morningPrograms.addStrings("123", "456"), "579")
        XCTAssertEqual(morningPrograms.addStrings("0", "0"), "0")
        XCTAssertEqual(morningPrograms.addStrings("9999", "1"), "10000")
    }

    func testAddStringsV2() {
        let morningPrograms = MorningPrograms()

        XCTAssertEqual(morningPrograms.addStringsV2("123", "456"), "579")
        XCTAssertEqual(morningPrograms.addStringsV2("0", "0"), "0")
        XCTAssertEqual(morningPrograms.addStringsV2("9999", "1"), "10000")
    }

}
