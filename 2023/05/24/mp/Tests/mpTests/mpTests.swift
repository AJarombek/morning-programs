/**
 Unit tests for a convert-a-number-to-hexadecimal program.
 - Author: Andrew Jarombek
 - Date: 5/24/2023
 */

import XCTest
@testable import mp


class ToHexTests: XCTestCase {
    func testToHex() {
        let programs = MorningPrograms()

        // Test case 1
        let num1 = 26
        XCTAssertEqual(programs.toHex(num1), "1a", "Test case 1 failed")

        // Test case 2
        let num2 = -1
        XCTAssertEqual(programs.toHex(num2), "ffffffff", "Test case 2 failed")
    }
}
