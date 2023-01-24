/**
 Unit tests for a guess-number-higher-or-lower program.
 - Author: Andrew Jarombek
 - Date: 1/23/2023
 */

import XCTest
@testable import mp

final class mpTests: XCTestCase {
    func testProgram() throws {
        let mp = MorningPrograms()

        XCTAssertEqual(mp.guessNumber(10), 6)
    }
}
