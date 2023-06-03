/**
 Unit tests for a island-perimeter program.
 - Author: Andrew Jarombek
 - Date: 6/3/2023
 */

import XCTest
@testable import mp


class MorningProgramsTests: XCTestCase {
    func testIslandPerimeter1() {
        let program = MorningPrograms()
        let grid = [[0, 1, 0, 0],
                    [1, 1, 1, 0],
                    [0, 1, 0, 0],
                    [1, 1, 0, 0]]
        let perimeter = program.islandPerimeter(grid)
        XCTAssertEqual(perimeter, 16)
    }

    func testIslandPerimeter2() {
        let program = MorningPrograms()
        let grid = [[1, 0, 0, 0],
                    [0, 0, 0, 0],
                    [0, 0, 0, 1],
                    [0, 0, 0, 0]]
        let perimeter = program.islandPerimeter(grid)
        XCTAssertEqual(perimeter, 8)
    }
}
