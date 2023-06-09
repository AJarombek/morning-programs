/**
 Unit tests for a next-greater-element-i program.
 - Author: Andrew Jarombek
 - Date: 6/8/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {
    func testNextGreaterElement1() {
        let program = MorningPrograms()
        let nums1 = [4, 1, 2]
        let nums2 = [1, 3, 4, 2]
        let result = program.nextGreaterElement(nums1, nums2)
        XCTAssertEqual(result, [-1, 3, -1])
    }

    func testNextGreaterElement2() {
        let program = MorningPrograms()
        let nums1 = [2, 4, 9]
        let nums2 = [5, 2, 3, 4, 9, 7, 1]
        let result = program.nextGreaterElement(nums1, nums2)
        XCTAssertEqual(result, [3, 9, -1])
    }
}
