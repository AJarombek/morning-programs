/**
 Unit tests for number-of-segments-in-a-string and arranging-coins programs.
 - Author: Andrew Jarombek
 - Date: 5/29/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {

    func testCountSegments() {
        let morningPrograms = MorningPrograms()

        // Test case 1: Single segment
        XCTAssertEqual(morningPrograms.countSegments("Hello"), 1)

        // Test case 2: Multiple segments
        XCTAssertEqual(morningPrograms.countSegments("Hello World"), 2)
    }

    func testArrangeCoins() {
        let morningPrograms = MorningPrograms()

        // Test case 1: 5 coins, can form 2 rows fully with 1 coin remaining
        XCTAssertEqual(morningPrograms.arrangeCoins(5), 2)

        // Test case 2: 8 coins, can form 3 rows fully with 2 coins remaining
        XCTAssertEqual(morningPrograms.arrangeCoins(8), 3)
    }

}
