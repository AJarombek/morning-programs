/**
 Unit tests for a find-all-numbers-disappeared-in-an-array program.
 - Author: Andrew Jarombek
 - Date: 5/30/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {

    func testFindDisappearedNumbers() {
        let morningPrograms = MorningPrograms()

        // Test case 1: Missing numbers [5, 6]
        let nums1 = [4, 3, 2, 7, 8, 2, 3, 1]
        XCTAssertEqual(morningPrograms.findDisappearedNumbers(nums1), [5, 6])

        // Test case 2: Missing numbers [2, 4]
        let nums2 = [1, 1, 3, 3]
        XCTAssertEqual(morningPrograms.findDisappearedNumbers(nums2), [2, 4])
    }

}
