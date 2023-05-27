/**
 Unit tests for a fizz-buzz program.
 - Author: Andrew Jarombek
 - Date: 5/26/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {

    func testFizzBuzz() {
        let morningPrograms = MorningPrograms()
        let result = morningPrograms.fizzBuzz(5)

        XCTAssertEqual(result.count, 5, "Result count should be equal to the input")
        XCTAssertEqual(result[0], "1", "Number at index 0 should be 1")
        XCTAssertEqual(result[1], "2", "Number at index 1 should be 2")
        XCTAssertEqual(result[2], "Fizz", "Number at index 2 should be Fizz")
        XCTAssertEqual(result[3], "4", "Number at index 3 should be 4")
        XCTAssertEqual(result[4], "Buzz", "Number at index 4 should be Buzz")
    }

}
