/**
 Unit tests for move-zeroes program.
 - Author: Andrew Jarombek
 - Date: 1/15/2023
 */

import XCTest
@testable import mpJan15

final class mpJan15Tests: XCTestCase {
    func testProgram() throws {
        let mp = mpJan15()
        var nums = [0,1,0,3,12]
        mp.moveZeroes(&nums)

        XCTAssertEqual([1,3,12,0,0], nums)
    }
}
