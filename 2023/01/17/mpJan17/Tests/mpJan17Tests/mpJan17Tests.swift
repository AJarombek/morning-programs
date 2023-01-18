/**
 Unit tests for range-sum-query-immutable program.
 - Author: Andrew Jarombek
 - Date: 1/17/2023
 */

import XCTest
@testable import mpJan17

final class mpJan17Tests: XCTestCase {
    func testProgram() throws {
        let numArray = NumArray([-2, 0, 3, -5, 2, -1])

        XCTAssertEqual(1, numArray.sumRange(0, 2))
        XCTAssertEqual(-1, numArray.sumRange(2, 5))
        XCTAssertEqual(-3, numArray.sumRange(0, 5))
    }
}
