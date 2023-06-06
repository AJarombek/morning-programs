/**
 Unit tests for a max-consecutive-ones program.
 - Author: Andrew Jarombek
 - Date: 6/6/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {
    func testFindMaxConsecutiveOnes1() {
        let program = MorningPrograms()
        let nums = [1, 1, 0, 1, 1, 1]
        let maxConsecutiveOnes = program.findMaxConsecutiveOnes(nums)
        XCTAssertEqual(maxConsecutiveOnes, 3)
    }

    func testFindMaxConsecutiveOnes2() {
        let program = MorningPrograms()
        let nums = [1, 0, 1, 1, 0, 1, 1, 1]
        let maxConsecutiveOnes = program.findMaxConsecutiveOnes(nums)
        XCTAssertEqual(maxConsecutiveOnes, 3)
    }
}
