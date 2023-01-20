/**
 Unit tests for power-of-four & reverse-string programs.
 - Author: Andrew Jarombek
 - Date: 1/20/2023
 */

import XCTest
@testable import mpJan20

final class mpJan20Tests: XCTestCase {
    func testProgram() throws {
        let mp = MpJan20()

        XCTAssertTrue(mp.isPowerOfFour(16))
        XCTAssertFalse(mp.isPowerOfFour(5))
        XCTAssertTrue(mp.isPowerOfFour(1))

        var str: [Character] = ["h","e","l","l","o"]
        mp.reverseString(&str)

        XCTAssertEqual(str, ["o","l","l","e","h"])
    }
}
