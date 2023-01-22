/**
 Unit tests for intersection-of-two-arrays-ii & valid-perfect-square programs.
 - Author: Andrew Jarombek
 - Date: 1/22/2023
 */

import XCTest
@testable import mp

final class mpTests: XCTestCase {
    func testProgram() throws {
        let mp = MorningPrograms()

        XCTAssertEqual(mp.intersect([1,2,2,1], [2,2]), [2,2])
        XCTAssertEqual(mp.intersect([4,9,5], [9,4,9,8,4]), [9,4])

        XCTAssertTrue(mp.isPerfectSquare(16))
        XCTAssertFalse(mp.isPerfectSquare(14))
    }
}
