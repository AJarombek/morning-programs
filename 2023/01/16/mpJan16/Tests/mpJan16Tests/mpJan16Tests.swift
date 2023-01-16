/**
 Unit tests for word-pattern program.
 - Author: Andrew Jarombek
 - Date: 1/16/2023
 */

import XCTest
@testable import mpJan16

final class mpJan16Tests: XCTestCase {
    func testProgram() throws {
        let mp = mpJan16()

        XCTAssertTrue(mp.wordPattern("abba", "dog cat cat dog"))
        XCTAssertFalse(mp.wordPattern("abba", "dog cat cat fish"))
        XCTAssertFalse(mp.wordPattern("aaaa", "dog cat cat dog"))
    }
}
