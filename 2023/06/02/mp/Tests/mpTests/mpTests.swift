/**
 Unit tests for a hamming-distance program.
 - Author: Andrew Jarombek
 - Date: 6/2/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {
    var morningPrograms: MorningPrograms!

    override func setUp() {
        super.setUp()
        morningPrograms = MorningPrograms()
    }

    override func tearDown() {
        morningPrograms = nil
        super.tearDown()
    }

    func testHammingDistance_DifferentBits() {
        let x = 5 // Binary: 101
        let y = 3 // Binary: 011
        let expected = 2
        let result = morningPrograms.hammingDistance(x, y)
        XCTAssertEqual(result, expected)
    }

    func testHammingDistance_SameBits() {
        let x = 10 // Binary: 1010
        let y = 14 // Binary: 1110
        let expected = 1
        let result = morningPrograms.hammingDistance(x, y)
        XCTAssertEqual(result, expected)
    }
}
