/**
 Unit tests for missing-number program.
 - Author: Andrew Jarombek
 - Date: 1/14/2023
 */

import XCTest
@testable import mpJan14

final class mpJan14Tests: XCTestCase {
    func testProgram() throws {
        let mp = mpJan14()
        XCTAssertEqual(mp.missingNumber([3,0,1]), 2)
        XCTAssertEqual(mp.missingNumber([0,1]), 2)

        XCTAssertEqual(mp.missingNumberV2([3,0,1]), 2)
        XCTAssertEqual(mp.missingNumberV2([0,1]), 2)
    }
}
