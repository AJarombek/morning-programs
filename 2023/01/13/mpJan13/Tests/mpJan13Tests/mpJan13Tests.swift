/**
 Unit tests for add-digits program.
 - Author: Andrew Jarombek
 - Date: 1/13/2023
 */

import XCTest
@testable import mpJan13

final class mpJan13Tests: XCTestCase {
    func testProgram() throws {
        let mp = mpJan13()
        XCTAssertEqual(mp.addDigits(38), 2)
        XCTAssertEqual(mp.addDigits(0), 0)
    }
}
