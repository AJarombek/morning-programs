/**
 Unit tests for power-of-three program.
 - Author: Andrew Jarombek
 - Date: 1/18/2023
 */

import XCTest
@testable import mpJan18

final class mpJan18Tests: XCTestCase {
    func testProgram() throws {
        let mp = MpJan18()

        XCTAssertTrue(mp.isPowerOfThree(27))
        XCTAssertFalse(mp.isPowerOfThree(0))
        XCTAssertFalse(mp.isPowerOfThree(-1))
        XCTAssertTrue(mp.isPowerOfThree(1))
    }
}
