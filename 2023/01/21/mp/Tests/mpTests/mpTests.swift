/**
 Unit tests for reverse-vowels-of-a-string & intersection-of-two-arrays programs.
 - Author: Andrew Jarombek
 - Date: 1/21/2023
 */

import XCTest
@testable import mp

final class mpTests: XCTestCase {
    func testProgram() throws {
        let mp = MorningPrograms()

        XCTAssertEqual(mp.reverseVowels("hello"), "holle")
        XCTAssertEqual(mp.intersection([1,2,2,1], [2,2]), [2])
    }
}
