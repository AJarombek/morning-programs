/**
 Unit tests for valid-anagram program.
 - Author: Andrew Jarombek
 - Date: 1/11/2023
 */

import XCTest
@testable import mpJan11

final class mpJan11Tests: XCTestCase {
    func testProgram() throws {
        let mp = mpJan11()
        XCTAssertTrue(mp.isAnagram("anagram", "nagaram"))
    }
}
