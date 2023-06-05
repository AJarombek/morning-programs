/**
 Unit tests for a license-key-formatting program.
 - Author: Andrew Jarombek
 - Date: 6/5/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {
    func testLicenseKeyFormatting1() {
        let program = MorningPrograms()
        let s = "5F3Z-2e-9-w"
        let k = 4
        let formatted = program.licenseKeyFormatting(s, k)
        XCTAssertEqual(formatted, "5F3Z-2E9W")
    }

    func testLicenseKeyFormatting2() {
        let program = MorningPrograms()
        let s = "2-5g-3-J"
        let k = 2
        let formatted = program.licenseKeyFormatting(s, k)
        XCTAssertEqual(formatted, "2-5G-3J")
    }
}
