/**
 Unit tests for a ransom-note program.
 - Author: Andrew Jarombek
 - Date: 1/24/2023
 */

import XCTest
@testable import mp

final class mpTests: XCTestCase {
    func testProgram() throws {
        let mp = MorningPrograms()

        XCTAssertFalse(mp.canConstruct("a", "b"))
        XCTAssertFalse(mp.canConstruct("aa", "ab"))
        XCTAssertTrue(mp.canConstruct("aa", "aab"))
    }
}
