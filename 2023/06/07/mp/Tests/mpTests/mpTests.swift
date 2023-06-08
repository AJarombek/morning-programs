/**
 Unit tests for a construct-the-rectangle program.
 - Author: Andrew Jarombek
 - Date: 6/7/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {
    func testConstructRectangle1() {
        let program = MorningPrograms()
        let area = 36
        let rectangle = program.constructRectangle(area)
        XCTAssertEqual(rectangle, [6, 6])
    }

    func testConstructRectangle2() {
        let program = MorningPrograms()
        let area = 48
        let rectangle = program.constructRectangle(area)
        XCTAssertEqual(rectangle, [8, 6])
    }
}
