/**
 Unit tests for counting-bits program.
 - Author: Andrew Jarombek
 - Date: 1/19/2023
 */

import XCTest
@testable import mpJan19

final class mpJan19Tests: XCTestCase {
    func testProgram() throws {
        let mp = MpJan19()

        XCTAssertEqual(mp.countBits(2), [0, 1, 1])
        XCTAssertEqual(mp.countBits(5), [0, 1, 1, 2, 1, 2])
    }
}
