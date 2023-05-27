/**
 Unit tests for a third-maximum-number program.
 - Author: Andrew Jarombek
 - Date: 5/27/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {

    func testThirdMax() {
        let morningPrograms = MorningPrograms()
        let nums = [3, 2, 1]
        let expected = 1
        let result = morningPrograms.thirdMax(nums)
        XCTAssertEqual(result, expected)
    }

    func testThirdMaxTwoNums() {
        let morningPrograms = MorningPrograms()
        let nums = [1, 2]
        let expected = 2
        let result = morningPrograms.thirdMax(nums)
        XCTAssertEqual(result, expected)
    }

}
